package com.ipartek.login.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.login.vo.Usuario;

/**
 * Servlet implementation class LoginController
 */
@WebServlet(name="login", urlPatterns={"/login"})
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		String recordar = request.getParameter("recordar");
		
		if("alberto".equals(user) && "1234".equals(pass)){
			Usuario u = new Usuario(user, pass);
			request.getSession().setAttribute("usuario", u);
			
			if(recordar!=null){
				Cookie cookie = new Cookie("usuario", user+"|"+pass);
				cookie.setMaxAge(10000);
				response.addCookie(cookie);
			}
		}
		
		//redirecciona a recursos finales!
		response.sendRedirect("privado/index.html");
		
		//ecadenar a otro recurso
		//request.getRequestDispatcher("login").forward(request, response);
		
		/*PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		Usuario u = (Usuario) request.getSession().getAttribute("usuario");
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Pagina de inicio</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<p>Hola, " + u.getUsuario() + "</p>");
		out.print("</body>");
		out.print("</html>");*/
		
	}
}
