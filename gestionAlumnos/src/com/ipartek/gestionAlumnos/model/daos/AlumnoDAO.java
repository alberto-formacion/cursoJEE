package com.ipartek.gestionAlumnos.model.daos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ipartek.gestionAlumnos.vo.Alumno;
import com.ipartek.gestionAlumnos.vo.Curso;

public class AlumnoDAO extends BaseDAO{

	public Alumno login(String user, String pass) {
		crearConexion();
		try {
			ps = conn.prepareStatement("select * from alumnos where usuario = ? && pass = ?");
			ps.setString(1, user);
			ps.setString(2, pass);
			
			rs = ps.executeQuery();

			if(rs.next()){
				Alumno a = new Alumno(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
				
				ps = conn.prepareStatement("select * from Alumnos_Cursos where Alumnos_idAlumnos = ?");
				ps.setInt(1, a.getIdAlumno());
				
				rs = ps.executeQuery();
				
				ArrayList<Integer> idCursos = new ArrayList<Integer>();
				
				while(rs.next()){
					idCursos.add(rs.getInt(2));
				}
				
				String sql = "select * from cursos where idCursos in (";
				
				for(int id : idCursos){
					sql += id + ",";
				}
				
				sql = sql.substring(0, sql.length()-1);
				
				sql += ")";
				
				ps = conn.prepareStatement(sql);
				
				rs = ps.executeQuery();
				
				ArrayList<Curso> cursos = new ArrayList<Curso>();
				
				while(rs.next()){
					cursos.add(new Curso(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
				}
				
				a.setCursos(cursos);
				
				return a;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			cerrarConexion();
		}
		
		return null;
	}

}
