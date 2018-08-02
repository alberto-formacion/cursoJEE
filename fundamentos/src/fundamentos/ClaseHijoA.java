package fundamentos;

import java.util.Date;

public class ClaseHijoA extends ClaseA{
	
	public ClaseHijoA(String nombre, Date fecha) {
		super(nombre, fecha);
	}

	public void despide() {
		System.out.println("Adios");
	}
	
	public void saluda() {
		System.out.println("Hola como un hijo");
	}
}
