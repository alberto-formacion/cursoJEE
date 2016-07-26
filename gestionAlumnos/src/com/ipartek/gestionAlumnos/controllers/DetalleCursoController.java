package com.ipartek.gestionAlumnos.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.gestionAlumnos.model.managers.CursoManager;
import com.ipartek.gestionAlumnos.vo.Curso;


@WebServlet("/curso")
public class DetalleCursoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	CursoManager cursoManager;
	
	@Override
	public void init() throws ServletException {
		cursoManager = new CursoManager();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.valueOf(request.getParameter("id"));
		
		Curso curso = cursoManager.getCursoByID(id);
		
		request.getSession().setAttribute("curso", curso);
		
		response.sendRedirect("privado/detalleCurso.jsp");
	}

}
