package fechas;

import java.util.zip.DataFormatException;

import exceptions.FechaException;

public class Fecha {
	private int anyo = 0, mes = 1, dia = 1;
	
	public static final int MESES_ANIO = 12;
	
	public static boolean esBisiesto(int anyo){
		if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))){
			return true;
		}else{
			return false;
		}
	}
	
	public Fecha(){
		
	}
	
	public Fecha (int anyo, int mes, int dia) throws FechaException{
		this.anyo = anyo;
		setMes(mes);
		setDia(dia);
	}
	
	public Fecha (Fecha f) throws FechaException{
		this.anyo = f.anyo;
		setMes(f.mes);
		setDia(f.dia);
	}
	
	public boolean esBisiesto(){
		return esBisiesto(this.anyo);
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) throws FechaException{
		if(mes>0 && mes<=12){
			this.mes = mes;
		}else{
			throw new FechaException("El mes " + mes + " no es valido!!");
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) throws FechaException{
		if(this.mes == 1 || 
				this.mes == 3 || 
				this.mes == 5 || 
				this.mes == 7 || 
				this.mes == 8 || 
				this.mes == 10 || 
				this.mes == 12){
			comprobarDia(31, dia);
		}else if (this.mes == 2){
			if(esBisiesto(this.anyo)){
				comprobarDia(29, dia);
			}else{
				comprobarDia(28, dia);
			}
		}else{
			comprobarDia(30, dia);
		}
	}
	
	private void comprobarDia(int diaMax, int dia) throws FechaException{
		if(dia>0 && dia<=diaMax){
			this.dia = dia;
		}else{
			throw new FechaException("El dia " + dia +" no es correcto para el mes " + this.mes);
		}
	}
	
	public void set(int anyo, int mes, int dia) throws FechaException{
		this.anyo = anyo;
		setMes(mes);
		setDia(dia);
	}
	
	public void set(Fecha f) throws FechaException{
		this.anyo = f.anyo;
		setMes(f.mes);
		setDia(f.dia);
	}
	
	public String toString(){
		return this.dia + "/" + this.mes + "/" + this.anyo;
	}
	
	public boolean equals(Object o){
		if(o instanceof Fecha){
			Fecha fecha = (Fecha) o;
			if((this.anyo == fecha.anyo) 
					&& (this.mes == fecha.mes) 
					&& (this.anyo == fecha.anyo) ){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}
