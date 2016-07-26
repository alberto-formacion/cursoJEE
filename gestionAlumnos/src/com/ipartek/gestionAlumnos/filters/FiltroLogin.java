package com.ipartek.gestionAlumnos.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.gestionAlumnos.model.managers.AlumnoManager;
import com.ipartek.gestionAlumnos.vo.Alumno;

@WebFilter("/login.jsp")
public class FiltroLogin implements Filter {
	private AlumnoManager alumnoManager;

    public FiltroLogin() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		Cookie[] cookies = req.getCookies();
		
		for(Cookie c : cookies){
			if("usuario".equals(c.getName())){
				String[] userpass = c.getValue().split(",");
				Alumno alumno = alumnoManager.login(userpass[0], userpass[1]);
				
				req.getSession().setAttribute("alumno", alumno);
				
				res.sendRedirect("privado/index.jsp");
			}
		}
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		alumnoManager = new AlumnoManager();
	}

}
