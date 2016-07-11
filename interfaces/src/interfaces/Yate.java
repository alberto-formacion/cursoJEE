package interfaces;

public class Yate implements Acuatico{

	@Override
	public void arrancar() {
		System.out.println("Estoy arrancando en el agua");
	}

	@Override
	public void tirarAncla() {
		System.out.println("Estoy echando el ancla");
	}
	
	public void desplegarTrampolin(){
		System.out.println("TrampolinOK");
	}

}
