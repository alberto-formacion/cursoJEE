package pajaros;

public abstract class Ave {
	
	public char sexo;
	public int edad;
	public DatosPersonales nombres;
	
	private static int numAvesCreadas = 0;
	
	public Ave (char sexo, int edad, DatosPersonales nombres){
		this.sexo = sexo;
		this.edad = edad;
		this.nombres = nombres;
		
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
	
	public abstract void cantar();

}
