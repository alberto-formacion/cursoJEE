package ejercicio1;

public class ProfesorEmerito extends Profesor{
	//ZONA DE ATRIBUTOS
	private int anosEmerito;
	
	//ZONA DE CONSTRUCTORES
	public ProfesorEmerito(String nombre, 
			int edad, 
			int anosConsolidado, 
			int anosEmerito){
		
		/*this.nombre = nombre;
		this.edad = edad;
		this.anosConsolidados = anosConsolidado;*/
		super(nombre, edad, anosConsolidado);
		this.anosEmerito = anosEmerito; 
		
	}
	
	//ZONA DE METODOS
	
	//[visibilidad] [static] [final] tipoRetorno nombreMetodo([parametros]){}
	
	public double obtenerSalarioBase(){
		double resultado;
		
		resultado = 925 + anosConsolidados * 33.25 + 47.80 * anosEmerito;
		
		return resultado;
	}
	

}
