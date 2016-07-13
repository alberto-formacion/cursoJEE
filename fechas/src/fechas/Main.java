package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		//formater fecha
		SimpleDateFormat formatoFecha = new SimpleDateFormat("'En Bilbao a' dd 'de' MMMMM 'del año' yyyy");
		
		//la fecha de ahora utilizando Date
		Date fecha1 = new Date();
		
		System.out.println(fecha1);
		System.out.println("Hoy es dia: " + fecha1.getDate());
		System.out.println(formatoFecha.format(fecha1));
		
		//la fecha de ahora utilizando GregorianCalendar
		GregorianCalendar fecha2 = new GregorianCalendar();
		fecha2.setTime(new Date());
		
		
		System.out.println(fecha2);
		/*System.out.println("La fecha es:" 
				+ fecha2.get(GregorianCalendar.DAY_OF_MONTH) 
				+ "/" + (fecha2.get(GregorianCalendar.MONTH)+1)
				+ "/" + fecha2.get(GregorianCalendar.YEAR));*/
		System.out.println("Hoy es dia: " + fecha2.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println(formatoFecha.format(fecha2.getTime()));
		
		//la fecha de ahora utilizando Calendar
		Calendar fecha3 = Calendar.getInstance();
		
		System.out.println(fecha3);
		System.out.println("Hoy es dia: " + fecha3.get(Calendar.DAY_OF_MONTH));
		System.out.println(formatoFecha.format(fecha3.getTime()));
		
		//convertir un String a fecha
		String fechaTxt = "20/04/1990";
		SimpleDateFormat formateoString = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date fechaDate = formateoString.parse(fechaTxt);
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(fechaDate);
			System.out.println(fechaDate);
			System.out.println(formatoFecha.format(gc.getTime()));
		} catch (ParseException e) {
			System.out.println("La fecha introducida es incorrecta MELON!");
			e.printStackTrace();
		}
		
		

	}

}
