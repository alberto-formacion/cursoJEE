package pajaros;

public class Loro extends Ave{
	
	public char region;
	public String color;
	
	public Loro (char sexo, int edad, char region, String color, DatosPersonales nombres){
		super(sexo, edad, nombres);
		this.region = region;
		this.color = color;
	}
	
	public void deDondeEres(){
		switch(region){
		case 'N':
			System.out.println("Norte");
			break;
		case 'E':
			System.out.println("Este");
			break;
		case 'S':
			System.out.println("Sur");
			break;
		case 'O':
			System.out.println("Oeste");
			break;
		default:
			System.out.println("La region no es correcta");
		}
	}

	@Override
	public void cantar() {
		System.out.println("Piiiiiiiiio-piiiiiiiiio loro bonito");
	}

}
