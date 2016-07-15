package basesDatos;

import java.sql.SQLException;
import java.util.Scanner;

import db.AccesoDB;
import vo.Ciudad;

public class MainSinAccesoDB {

	public static void main(String[] args) {
		AccesoDB db = new AccesoDB();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime que ciudad quieres buscar:");
		
		String ciudad = entrada.nextLine();
		
		Ciudad c = db.buscarCiudad(ciudad);
			
		System.out.println(c.toString());
	}

}
