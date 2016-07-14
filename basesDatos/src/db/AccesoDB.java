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

	public Ciudad buscarCiudad (String nombreCiudad) throws SQLException, ClassNotFoundException{
		crearConexion();
		
		ps = conn.prepareStatement("select * from city where name like ?");
		ps.setString(1, nombreCiudad);
		
		rs = ps.executeQuery();
		
		Ciudad c = null;
		
		while(rs.next()){
			c = new Ciudad(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
		}
		
		cerrarConexion();
		
		return c;
	}
	
	/*public ArrayList<Ciudad> getCiudadesByPopulation(int population){
		
	}*/
	
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
