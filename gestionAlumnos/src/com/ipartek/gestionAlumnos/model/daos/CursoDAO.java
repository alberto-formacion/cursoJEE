package com.ipartek.gestionAlumnos.model.daos;

import com.ipartek.gestionAlumnos.vo.Curso;

public class CursoDAO extends BaseDAO{

	public Curso getCursoByID(int id) {
		return new Curso(1,"curso1", "Este es un curso muy molon", "80");
	}

}
