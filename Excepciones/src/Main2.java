
public class Main2 {

	public static void main(String[] args) {
		System.out.println("Hola");
		try{
			pintarPrimerParametro(args);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("Hay que poner un parametro");
		}
		System.out.println("Adios");

	}
	
	public static void pintarPrimerParametro(String[] args) throws ArrayIndexOutOfBoundsException{
		System.out.println("Estoy entrando en el metodo");
		System.out.println(args[0]);
		System.out.println("He terminado de ejecutar el metodo");
	}

}
