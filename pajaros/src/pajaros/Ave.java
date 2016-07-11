package pajaros;

public class Ave {
	
	public char sexo;
	public int edad;
	
	private static int numAvesCreadas = 0;
	
	public Ave (char sexo, int edad){
		this.sexo = sexo;
		this.edad = edad;
		
		numAvesCreadas++;
	}
	
	public static final void getNumAvesCreadas(){
		System.out.println("Se han creado " + numAvesCreadas + " aves");
	}
	
	public void quienSoy(){
		System.out.print("Tengo " + edad + " años y soy ");
		if(sexo == 'M'){
			System.out.println("Macho");
		}else{
			System.out.println("Hembra");
		}
	}

}
