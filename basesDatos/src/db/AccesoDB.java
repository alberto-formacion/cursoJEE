package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.Ciudad;

public class AccesoDB {
	
	private static Connection conn = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;

	public static Ciudad buscarCiudad (String nombreCiudad){
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
	
	public static Ciudad buscarCiudad(int id){
		try {
			crearConexion();
			
			ps = conn.prepareStatement("select * from city where ID = ?");
			ps.setInt(1, id);
			
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
	
	public static ArrayList<Ciudad> getCiudadesByPopulation(int population){
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
	
	public static void crearCiudad(Ciudad c){
		try{
			crearConexion();
			ps = conn.prepareStatement("insert into city (Name, CountryCode, District, Population) values (?,?,?,?)");
			
			ps.setString(1, c.getNombre());
			ps.setString(2, c.getCodigoPais());
			ps.setString(3, c.getDistrito());
			ps.setInt(4, c.getPopulacion());
			
			int resultado = ps.executeUpdate();
			
			System.out.println("El resultado es:" + resultado);
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				cerrarConexion();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void modificarCiudad(int id, Ciudad c){
		try {
			crearConexion();
			ps = conn.prepareStatement("UPDATE city SET name = ?, "
					+ "CountryCode = ?, "
					+ "District = ?, "
					+ "Population = ? "
					+ "WHERE ID = ?");
			
			ps.setString(1, c.getNombre());
			ps.setString(2, c.getCodigoPais());
			ps.setString(3, c.getDistrito());
			ps.setInt(4, c.getPopulacion());
			ps.setInt(5, id);
			
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				cerrarConexion();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void borrarCiudad(int id){
		try {
			crearConexion();
			ps = conn.prepareStatement("DELETE FROM city WHERE ID = ?");
			ps.setInt(1, id);
			
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				cerrarConexion();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static void crearConexion() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
	}
	
	private static void cerrarConexion() throws SQLException{
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
