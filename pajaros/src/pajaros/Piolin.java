package pajaros;

public class Piolin extends Canario{
	public int numPeliculas;

	public Piolin(char sexo, int edad, int tamano, int numPeliculas, DatosPersonales nombres) {
		super(sexo, edad, tamano, nombres);
		this.numPeliculas = numPeliculas;
	}

	@Override
	public void cantar() {
		System.out.println("Pio pio soy un Piolin");
	}
}
