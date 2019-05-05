package validation;

import exception.ExceptionParkingEntrance;
import model.Vehicle;

public class ValidationTires implements IEntranceValidation {

	public static final int TIRESALLOWED = 6;
	
	@Override
	public void validate(Vehicle vehicle) {
		if(vehicle.getTires() > TIRESALLOWED){
			throw new ExceptionParkingEntrance("Wrong Tires!!, it's should be less or equals than six");
		}
	}

}
