package pajaros;

public class Main {
	
	public static void main(String[] args){
		//EJERCICIO 1
		/*Piolin piolin = new Piolin('M', 3, 17, 4);
		Loro loro = new Loro('H', 2, 'N', "Rojo");
		
		piolin.quienSoy();
		
		loro.quienSoy();
		
		piolin.altura();
		
		loro.deDondeEres();
		
		piolin.tamano = 35;
		
		piolin.altura();
		
		loro.region = 'S';
		
		loro.deDondeEres();
		
		Ave.getNumAvesCreadas();*/
		
		//EJERCICIO 2
		Piolin[] piolines = new Piolin[3];
		
		piolines[0] = new Piolin('M', 3, 15, 2, new DatosPersonales("pikolon", "pakito"));
		piolines[1] = new Piolin('H', 5, 30, 12, null);
		piolines[2] = new Piolin('H', 1, 7, 1, null);
		
		piolines[1].nombres = new DatosPersonales("pikolin", "patxi");
		
		Loro lorito = new Loro('M', 5, 'N', "verde", null);
		
		lorito.cantar();
		
		for(int i=0;i<piolines.length;i++){
			piolines[i].cantar();
		}
		
		System.out.println("El nombre del piolin es: " 
				+ piolines[0].nombres.getNombreAve() + " y su dueño se llama: " 
				+ piolines[0].nombres.getNombreDueno());
	}

}
