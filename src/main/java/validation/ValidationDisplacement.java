package validation;

import exception.ExceptionParkingEntrance;
import model.Vehicle;

public class ValidationDisplacement implements IEntranceValidation {

	public static final double WRONGDISPLACEMENT = 0.0;
	
	@Override
	public void validate(Vehicle vehicle) {
		if(vehicle.getDisplacement() <= WRONGDISPLACEMENT){
			throw new ExceptionParkingEntrance("Wrong displacement!!, it's should be greater than zero");
		}
	}

}
