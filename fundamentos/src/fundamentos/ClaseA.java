package fundamentos; // el paquete donde de se encuentra la clase

//importacion de otras clases
import java.util.Date;

//definicion de la clase
public class ClaseA {
	//atributos	
	//[visibilidad] [modificador] tipoDeDato nombre [= valorInicial]
	//visibilidad = private/(si no pongo NADA - packaged)/protected/public
	//modificador = final|static
	public static int fijo = 5;
	String nombre;
	Date fecha;
	
	//constructores
	public ClaseA(String nombre, Date fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	
	//metodos
	//[visibilidad] [modificador] tipoRetorno nombre ([parametro])
	//visibilidad = private/(si no pongo NADA - packaged)/protected/public
	//modificador = final|static|synchronized
	public void saluda() {
		System.out.println("Hola");
	}
	
	public void saluda(String nombre) {
		System.out.println("Hola " + nombre);
	}
	
	public void saluda(String nombre, String apellidos) {
		System.out.println("Hola " + nombre + " " + apellidos);
	}
	
	public void saluda(int veces) {
		for(int i=0;i<veces;i++) {
			System.out.println("Hola");
		}
	}
	
	public void saluda(String nombre, int veces) {
		for(int i=0;i<veces;i++) {
			System.out.println("Hola " + nombre);
		}
	}
	
	public void saluda(int veces, String nombre) {
		for(int i=0;i<veces;i++) {
			System.out.println("Hola " + nombre);
		}
	}

}
