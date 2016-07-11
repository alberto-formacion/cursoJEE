package interfaces;

public class Anfibio implements Acuatico, Terrestre{

	@Override
	public void acelerar() {
		System.out.println("Velocidad aumentada");
		
	}

	@Override
	public void frenar() {
		System.out.println("Velocidad reducida");
		
	}

	@Override
	public void arrancar() {
		System.out.println("Estoy arrancando como anfibio");
		
	}

	@Override
	public void tirarAncla() {
		System.out.println("Estoy echando el ancla");
		
	}

}
