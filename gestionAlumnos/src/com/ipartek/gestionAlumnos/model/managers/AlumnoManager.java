package com.ipartek.gestionAlumnos.model.managers;

import com.ipartek.gestionAlumnos.model.daos.AlumnoDAO;
import com.ipartek.gestionAlumnos.vo.Alumno;

public class AlumnoManager {
	
	AlumnoDAO alumnoDAO;
	
	public AlumnoManager(){
		alumnoDAO = new AlumnoDAO();
	}

	public Alumno login (String user, String pass){
		Alumno alumno = alumnoDAO.login(user,pass);
		return alumno;
	}
	
}
