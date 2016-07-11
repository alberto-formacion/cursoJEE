package ejercicioMates;

public class Main {

	public static void main(String[] args) {
		
		boolean esPrimo = Operaciones.esPrimo(5);
		
		if(esPrimo){
			System.out.println("El numero es primo");
		}else{
			System.out.println("El numero NO es primo");
		}
		
		long numeroFactorial = Operaciones.factorial(5, false);
		
		Operaciones.fibonacci(6);
		
		Operaciones.mostrarDivisiores(8);
		
		System.out.println("");
		
		Operaciones.mostrarDivisioresPrimos(8);
		
		System.out.println("");
		
		Operaciones.mostrarPrimos(5, 100);
		
		System.out.println("");
		
		double potencia = Operaciones.potencia(2, 3);
		
		System.out.println(2 + " a la " + 3 + " es " + potencia);

	}

}
