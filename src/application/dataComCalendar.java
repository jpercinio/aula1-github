 package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class dataComCalendar {

public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		//acrescentando 4 horas na data acima
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);//a data d esta instanciada dentro do calendário cal
		cal.add(Calendar.HOUR_OF_DAY, 4);//neste exemplo adiciona 4 horas no dia
		
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		int minutes = cal.get(Calendar.MINUTE);//devolve a qde de minutos na data 
		System.out.println("Minutes: " + minutes);
		
		int month = 1 + cal.get(Calendar.MONTH);//no calendar o mês começa com o valor 0
		System.out.println("Month: " + month);
	}
}


