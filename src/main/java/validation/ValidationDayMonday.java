package validation;

import exception.ExceptionParkingEntrance;
import model.Vehicle;
import parking.DateToday;

public class ValidationDayMonday implements IEntranceValidation{

	
	private static final char PLACA_INICIA_EN_A = 'A';
	private DateToday dateToday;
	
	public ValidationDayMonday(DateToday dateToday) {
		this.dateToday = dateToday;
	}
	
	@Override
	public void validate(Vehicle vehicle) {
		  if(dateToday.isMonday() && vehicle.getPlate().toUpperCase().charAt(0) == PLACA_INICIA_EN_A){
			throw new ExceptionParkingEntrance("Vehicle with car plate that begin in 'A' can't ingress the monday");  
		  }		
	}
		
}
