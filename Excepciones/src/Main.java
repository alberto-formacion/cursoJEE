
public class Main {

	public static void main (String[] args){
		System.out.println("Hola");
		try{
			System.out.println(args[0]);
			String cadena = null;
			int longitud = cadena.length();
			System.out.println(longitud);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Hay que meter un parametro");
		}catch(Exception e){
			System.out.println("Esto es otro error");
		}finally{
			System.out.println("ESTO SE EJECUTA SIEMPRE");
		}
		
		System.out.println("Adios");
	}
	
}
