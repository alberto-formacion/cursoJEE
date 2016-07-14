package vo;

public class Ciudad {
	private int id;
	private String nombre;
	private String codigoPais;
	private String distrito;
	private int populacion;
	
	public Ciudad(int id, String nombre, String codigoPais, String distrito, int populacion) {
		this.id = id;
		this.nombre = nombre;
		this.codigoPais = codigoPais;
		this.distrito = distrito;
		this.populacion = populacion;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoPais() {
		return codigoPais;
	}
	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public int getPopulacion() {
		return populacion;
	}
	public void setPopulacion(int populacion) {
		this.populacion = populacion;
	}
	
	public String toString(){
		return "La ciudad se llama " + nombre + " esta en el distrito " + distrito + " y tiene una populacion de " + populacion + " habitantes";
	}
}
