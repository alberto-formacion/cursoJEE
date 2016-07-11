package ejercicioMates;

public class Operaciones {
	
	public static boolean esPrimo(int numero){
		for(int i=2;i<numero;i++){
			if(numero%i==0){
				return false;
			}
		}
		
		return true;
	}

	public static long factorial(int numero, boolean mostrar){
		long resultado = 1;
		
		if(mostrar){
			System.out.print(numero+"!=");
		}
		
		for(int i = 1; i<=numero; i++){
			resultado = resultado * i;
			if(mostrar){
				System.out.print(i);
				if(i!=numero){
					System.out.print("x");
				}
				
			}
		}
		
		if(mostrar){
			System.out.println("=" + resultado);
		}
		
		return resultado;
	}
	
	public static void fibonacci(int numFactores){
		
		int numero1 = 0;
		int numero2 = 1;
		String fibonacci = "";
		
		if(numFactores==1){
			System.out.print("Fibonacci:"+numero1);
		}else{
			//System.out.print("Fibonacci:"+numero1+", " + numero2 + ", ");
			fibonacci = "Fibonacci:"+numero1+", " + numero2 + ", ";
			
			for(int i=2;i<numFactores;i++){
				int nuevoValor = numero1 + numero2;
				//System.out.print(nuevoValor + ", ");
				//fibonacci = fibonacci + nuevoValor + ", ";
				fibonacci += nuevoValor + ", ";
				
				numero1 = numero2;
				numero2 = nuevoValor;
				
			}
			System.out.println(fibonacci.substring(0, fibonacci.length()-2));
		}

	}
	
	public static void mostrarDivisiores(int numero){
		System.out.print("Los divisores son: ");
		for(int i = 1;i <= numero; i++){
			if(numero%i==0){
				System.out.print(i + ", ");
			}
		}
	}
	
	public static void mostrarDivisioresPrimos(int numero){
		System.out.print("Los divisores primos son: ");
		for(int i = 1;i <= numero; i++){
			if(numero%i==0){
				if(esPrimo(i)){
					System.out.print(i + ", ");
				}
			}
		}
	}
	
	public static void mostrarPrimos(int numInicial, int numFinal){
		if(numFinal>numInicial){
			System.out.print("Los numeros primos entre " + numInicial + " y " + numFinal + " son:");
			for(int i=numInicial;i<=numFinal;i++){
				if(esPrimo(i)){
					System.out.print(i + ", ");
				}
			}
		}else{
			System.out.println("El numero final no puede ser mayor que el numero inicial");
		}
	}
	
	public static double potencia (int base, int potencia){
		double resultado = base;
		for(int i=0;i<potencia-1;i++){
			resultado *= base;
		}
		
		return resultado;
	}
	
	public static long combinaciones(int grupos, int total) { 
		//formula: total!/grupos!* (total-grupos)!;
		return factorial(total, false)/factorial(grupos, false) * factorial((total-grupos),false);
	}
	
	public static long variaciones(int grupos, int total) {
		//formula: total! / (total - grupos)!;
		return factorial(total, false)/factorial((total-grupos),false);
	}
	
	public static long permutaciones(int numElementos) {
		//formula: numElementos!
		return factorial(numElementos,false);
	}
}
