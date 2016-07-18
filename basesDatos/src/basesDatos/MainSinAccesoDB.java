package basesDatos;

import java.sql.SQLException;
import java.util.Scanner;

import db.AccesoDB;
import vo.Ciudad;

public class MainSinAccesoDB {

	public static void main(String[] args) {
		/*AccesoDB.crearCiudad(new Ciudad("Orduña", "ESP", "euskadi", 10000));
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime que ciudad quieres buscar:");
		
		String ciudad = entrada.nextLine();
		
		Ciudad c = AccesoDB.buscarCiudad(ciudad);
			
		System.out.println(c.toString());*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Hola soy el gestorCiudades2000");
		while(true){
			pintarMenu();
			
			String opcion = entrada.nextLine();
			
			try{
				int opcionNumero = Integer.valueOf(opcion);
				if(opcionNumero>0 && opcionNumero <= 4){
					switch (opcionNumero) {
					case 1:
						System.out.println("Dime que ciudad quieres buscar:");
						String ciudad = entrada.nextLine();
						Ciudad c = AccesoDB.buscarCiudad(ciudad);
						System.out.println(c.toString());
						break;
					case 2:
						System.out.println("Dime el ID de la ciudad que quieres modificar:");
						int id = entrada.nextInt();
						
						Ciudad ciudadModificar = AccesoDB.buscarCiudad(id);
						
						System.out.println("Introduce el nuevo valor para Nombre (vacio si no quieres modificar):");
						String nombre = entrada.nextLine();
						if("".equals(nombre)){
							nombre = ciudadModificar.getNombre();
						}
						
						System.out.println("Introduce el nuevo valor para Codigo de Pais (vacio si no quieres modificar):");
						String codigoPais = entrada.nextLine();
						if("".equals(codigoPais)){
							codigoPais = ciudadModificar.getCodigoPais();
						}
						
						System.out.println("Introduce el nuevo valor para Distrito (vacio si no quieres modificar):");
						String distrito = entrada.nextLine();
						if("".equals(distrito)){
							distrito = ciudadModificar.getDistrito();
						}
						
						System.out.println("Introduce el nuevo valor para la populacion (0 si no quieres modificar):");
						int populacion = entrada.nextInt();
						
						if(0==populacion){
							populacion = ciudadModificar.getPopulacion();
						}
						
						AccesoDB.modificarCiudad(id, new Ciudad(nombre, codigoPais, distrito, populacion));
						
						break;
					case 3:
						System.out.println("Introduce los datos de la nueva ciudad:");
						System.out.println("Nombre:");
						String nombreAlta = entrada.nextLine();
						System.out.println("Codigo de Pais:");
						String codigoPaisAlta = entrada.nextLine();
						System.out.println("Distrito:");
						String ditritoAlta = entrada.nextLine();
						System.out.println("Populacion:");
						int populacionAlta = entrada.nextInt();
						
						AccesoDB.crearCiudad(new Ciudad(nombreAlta, codigoPaisAlta, ditritoAlta, populacionAlta));
						break;
					case 4:
						System.out.println("Dime el ID de la ciudad que quieres borrar:");
						int idBaja = entrada.nextInt();
						
						AccesoDB.borrarCiudad(idBaja);
						
						break;
					default:
						break;
					}
				}else if(opcionNumero==0){
					System.out.println("Ha sido un placer!!");
					break;
				}else{
					System.out.println("Del 1 al 4 MELON!!");
				}
			}catch(NumberFormatException e){
				System.out.println("Hay que meter un numerito... LISTO!!");
			}
		}
	}
	
	private static void pintarMenu(){
		System.out.println("1.-Buscar una ciudad por nombre");
		System.out.println("2.-Modificar una ciudad");
		System.out.println("3.-Dar de alta una ciudad");
		System.out.println("4.-Borrar ciudad");
		System.out.println("0.-Salir de la aplicacion");
		System.out.println("elige una opcion:");
	}

}
