package parking;

import model.Vehicle;
import validation.Validations;

public class Parking {
	
	Validations validations;
	public Parking(Validations validations){
		this.validations = validations;
	}
	
	
	public void allowVehicleEntrance (Vehicle vehicle) {				
		validations.validations().forEach(validation -> validation.validate(vehicle));		
    }
	
}
