package parking;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateToday {
	
	public static final int MONDAY = 1;
	public static final String ZONAHORARIA = "America/Bogota";
	
	
	public boolean isMonday(){
		return dayToday() == MONDAY;
	}
		
	/**
	 * La indicaci�n de los n�meros inicia en Lunes=1, Martes=2...Domingo =7;
	 * 
	 * @return el n�mero de la semana
	 */
	public int dayToday(){
		return LocalDateTime.now(ZoneId.of(ZONAHORARIA)).getDayOfWeek().getValue();
	}
}
