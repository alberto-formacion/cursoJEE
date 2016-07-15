package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.Ciudad;

public class AccesoDB {
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public Ciudad buscarCiudad (String nombreCiudad){
		try {
			crearConexion();
			
			ps = conn.prepareStatement("select * from city where name like ?");
			ps.setString(1, nombreCiudad);
			
			rs = ps.executeQuery();
			
			Ciudad c = null;
			
			while(rs.next()){
				c = new Ciudad(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
			}
			
			return c;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}finally{
			try {
				cerrarConexion();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	public ArrayList<Ciudad> getCiudadesByPopulation(int population){
		ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
		try {
			crearConexion();
			ps = conn.prepareStatement("Select * from city where population > ?");
			ps.setInt(1, population);
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				Ciudad ciudad = new Ciudad(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
				ciudades.add(ciudad);
			}
			
			return ciudades;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return ciudades;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return ciudades;
		}finally{
			try {
				cerrarConexion();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void crearCiudad(Ciudad c){
		
	}
	
	public void modificarCiudad(int id, Ciudad c){
		
	}
	
	public void borrarCiudad(int id){
		
	}
	
	private void crearConexion() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
	}
	
	private void cerrarConexion() throws SQLException{
		if(rs!=null){
			rs.close();
		}
		
		if(ps!=null){
			ps.close();
		}
		
		if(conn!=null){
			conn.close();
		}
	}
}
