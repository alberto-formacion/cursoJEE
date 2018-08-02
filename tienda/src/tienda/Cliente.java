package tienda;

public class Cliente {
	
	String nombre;
	String telefono;
	Integer edad;
	
	public Cliente(String nombre, String telefono, Integer edad) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.edad = edad;
	}

	public void comprar() {
		System.out.println("Compro como un cliente normal");
	}

}
