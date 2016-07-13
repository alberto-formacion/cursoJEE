package pajaros;

public abstract class Canario extends Ave{
	
	public int tamano;
	
	public Canario(char sexo, int edad, DatosPersonales nombres){
		super(sexo, edad, nombres);
	}
	
	public Canario(char sexo, int edad, int tamano, DatosPersonales nombres){
		super(sexo, edad, nombres);
		this.tamano = tamano;
	}
	
	public void altura(){
		if(tamano>30){
			System.out.println("El canario es grande");
		}else if(tamano >= 15 && tamano <= 30){
			System.out.println("El canario es mediano");
		}else{
			System.out.println("El canario es pequeño");
		}
	}
	
}
