package pajaros;

public class Main {
	
	public static void main(String[] args){
		Piolin piolin = new Piolin('M', 3, 17, 4);
		Loro loro = new Loro('H', 2, 'N', "Rojo");
		
		piolin.quienSoy();
		
		loro.quienSoy();
		
		piolin.altura();
		
		loro.deDondeEres();
		
		piolin.tamano = 35;
		
		piolin.altura();
		
		loro.region = 'S';
		
		loro.deDondeEres();
		
		Ave.getNumAvesCreadas();
	}

}
