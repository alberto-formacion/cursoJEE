package basesDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

import vo.Ciudad;


public class Main {

	public static void main(String[] args) {
		Connection conn = null;
		//Statement st = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		Scanner entrada = new Scanner(System.in);
		
		try{
			//Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Establecer la conexion
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			
			//Preparar consulta
			//st = conn.createStatement();
			st = conn.prepareStatement("select * from city where name like ?");
			
			System.out.println("Dime que ciudad quieres buscar:");
			
			String ciudad = entrada.nextLine();
			
			//rellenar valores de la preparedstatement
			st.setString(1, ciudad);
			
			//Lanzar la consulta
			//rs = st.executeQuery("Select * from city where name like '" + ciudad + "'");
			rs = st.executeQuery();
			
			ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
			
			while(rs.next()){
				Ciudad c = new Ciudad(rs.getInt("id"), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
				ciudades.add(c);
			}
			
			System.out.println(ciudades.get(0).toString());
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null){
					rs.close();
				}
				
				if(st!=null){
					st.close();
				}
				
				if(conn!=null){
					conn.close();
				}
				
				entrada.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
