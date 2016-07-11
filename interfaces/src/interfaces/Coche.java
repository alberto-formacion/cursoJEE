package interfaces;

public class Coche implements Terrestre{

	@Override
	public void arrancar() {
		System.out.println("Estoy arrancando");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Velocidad aumentada");
	}

	@Override
	public void frenar() {
		System.out.println("Velocidad reducida");
	}

}
