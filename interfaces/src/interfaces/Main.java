package interfaces;

public class Main {
	
	public static void main(String[] args){
		Acuatico yate = new Yate();
		yate.arrancar();
		yate.tirarAncla();
		
		if(yate instanceof Yate){
			((Yate)yate).desplegarTrampolin();
		}
		
		Terrestre coche = new Coche();
		coche.arrancar();
		coche.acelerar();
		coche.frenar();
		
		Acuatico anfibioAgua = new Anfibio();
		
		anfibioAgua.arrancar();
		anfibioAgua.tirarAncla();
		
		Terrestre anfibioTierra = new Anfibio();
	
		anfibioTierra.arrancar();
		anfibioTierra.acelerar();
		anfibioTierra.frenar();
		
	}

}
