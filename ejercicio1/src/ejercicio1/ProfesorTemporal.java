package ejercicio1;

public class ProfesorTemporal extends Profesor{
	
	int duracionContrato;
	
	public ProfesorTemporal(String nombre, 
			int edad, 
			int anosConsolidados, 
			int duracionContrato){
		super(nombre, edad, anosConsolidados);
		this.duracionContrato = duracionContrato;
	}

}
