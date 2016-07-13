package scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre:");
		String nombre = entrada.nextLine();
		System.out.println("Introduce tu edad");
		int edad = entrada.nextInt();
		System.out.println("Hola, " + nombre + " tienes " + edad + " años");
		entrada.close();
	}

}
