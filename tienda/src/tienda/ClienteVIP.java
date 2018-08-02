package tienda;

public class ClienteVIP extends Cliente{

	int dto;
	
	public ClienteVIP(String nombre, String telefono, Integer edad, int dto) {
		super(nombre, telefono, edad);
		this.dto = dto;
	}
	
	public void comprar() {
		System.out.println("Compro como VIP con " + dto + "%");
	}

}
