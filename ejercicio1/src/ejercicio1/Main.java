package ejercicio1;

public class Main {

	public static void main(String[] args) {
		ProfesorEmerito alberto = new ProfesorEmerito("Alberto", 32, 5, 3);
		ProfesorEmerito profe2 = new ProfesorEmerito("Pako", 50, 20, 10);
		Profesor profe = new Profesor("Pepe", 56, 6);
		ProfesorTemporal profeTemp = new ProfesorTemporal("Patxi", 25, 1, 1);
		
		Profesor[] arrayProfesores = new Profesor[4];
		
		arrayProfesores[0] = alberto;
		arrayProfesores[1] = profe2;
		arrayProfesores[2] = profe;
		arrayProfesores[3] = profeTemp;
		
		for(int i=0;i<arrayProfesores.length;i++){
			if(arrayProfesores[i] instanceof ProfesorEmerito){
				ProfesorEmerito pe = (ProfesorEmerito) arrayProfesores[i];
				pe.obtenerSalarioBase();
			}
		}
		
		System.out.println(alberto);
		System.out.println(alberto.nombre);
		System.out.println(profe2.nombre);
		profe2.nombre = "Paco";
		System.out.println(profe2.nombre);
		
		System.out.println("El salario base de " + alberto.nombre + " es :" + alberto.obtenerSalarioBase());
		System.out.println("El salario base de " + profe2.nombre + " es :" + profe2.obtenerSalarioBase());

		/*alberto.nombre = "Alberto";
		alberto.edad = 32;
		alberto.anosConsolidados = 5;*/
	}

}
