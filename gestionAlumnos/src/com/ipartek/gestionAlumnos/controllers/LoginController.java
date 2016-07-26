package com.ipartek.gestionAlumnos.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.gestionAlumnos.model.managers.AlumnoManager;
import com.ipartek.gestionAlumnos.vo.Alumno;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AlumnoManager alumnoManager;
    public LoginController() {
        super();
    }
    
    @Override
    public void init() throws ServletException {
    		alumnoManager = new AlumnoManager();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		Alumno alumno = alumnoManager.login(user, pass);
		
		if(alumno != null){
			
			if("on".equals(request.getParameter("recordar"))){
				Cookie cookie = new Cookie("usuario", user+","+pass);
				cookie.setMaxAge(9999999);
				response.addCookie(cookie);
			}else{
				Cookie[] cookies = request.getCookies();
				for(Cookie c : cookies){
					if("usuario".equals(c.getName())){
						c.setMaxAge(0);
						response.addCookie(c);
					}
				}
			}
			
			request.getSession().setAttribute("alumno", alumno);
			
			response.sendRedirect("privado/index.jsp");
		}else{
			response.sendRedirect("login.jsp?loginKO=true");
		}
	}

}
