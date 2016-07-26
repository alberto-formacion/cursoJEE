package com.ipartek.gestionAlumnos.model.managers;

import com.ipartek.gestionAlumnos.model.daos.CursoDAO;
import com.ipartek.gestionAlumnos.vo.Curso;

public class CursoManager {
	
	CursoDAO cursoDAO;
	
	public CursoManager(){
		cursoDAO = new CursoDAO();
	}

	public Curso getCursoByID(int id) {
		return cursoDAO.getCursoByID(id);
	}

}
