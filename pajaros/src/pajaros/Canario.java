package pajaros;

public class Canario extends Ave{
	
	public int tamano;
	
	public Canario(char sexo, int edad){
		super(sexo, edad);
	}
	
	public Canario(char sexo, int edad, int tamano){
		super(sexo, edad);
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
