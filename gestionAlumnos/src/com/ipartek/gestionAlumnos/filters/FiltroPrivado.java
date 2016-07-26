package com.ipartek.gestionAlumnos.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.gestionAlumnos.vo.Alumno;

/**
 * Servlet Filter implementation class FiltroLogin
 */
@WebFilter("/privado/*")
public class FiltroPrivado implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		Alumno alumno = (Alumno) req.getSession().getAttribute("alumno");
		
		if(alumno!=null){
			chain.doFilter(request, response);
		}else{
			res.sendRedirect("../login.jsp");
		}
		
		
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
