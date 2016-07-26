package com.ipartek.gestionAlumnos.model.daos;

import java.sql.Connection;
import java.util.ArrayList;

import com.ipartek.gestionAlumnos.vo.Alumno;
import com.ipartek.gestionAlumnos.vo.Curso;

public class AlumnoDAO extends BaseDAO{

	public Alumno login(String user, String pass) {
		if("alberto".equals(user) && "1234".equals(pass)){
			Alumno a = new Alumno("Alberto", "GCR", "66666666", "Calle melancolia", user, pass);
			
			ArrayList<Curso> cursos = new ArrayList<Curso>();
			
			cursos.add(new Curso(1,"curso1", "Este es un curso muy molon", "80"));
			cursos.add(new Curso(2,"curso2", "Este es un curso muy molon", "120"));
			cursos.add(new Curso(3,"curso3", "Este es un curso muy molon", "40"));
			cursos.add(new Curso(4,"curso4", "Este es un curso muy molon", "180"));
			
			a.setCursos(cursos);
			
			return a;
		}
		return null;
	}

}
