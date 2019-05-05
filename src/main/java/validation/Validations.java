package validation;

import java.util.ArrayList;
import java.util.List;

import parking.DateToday;

public class Validations {
	
	// Generics -->
	// Command Validate 
	public List<IEntranceValidation> validations(){
		List<IEntranceValidation> validations = new ArrayList<>();
		validations.add(new ValidationDayMonday(new DateToday()));
		validations.add(new ValidationDisplacement());
		validations.add(new ValidationTires());
		return validations;
	}
	
}
