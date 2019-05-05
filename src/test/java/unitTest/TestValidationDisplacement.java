package unitTest;


import org.junit.Test;
import builder.VehicleBuilder;
import exception.ExceptionParkingEntrance;
import model.Vehicle;
import validation.ValidationDisplacement;


public class TestValidationDisplacement {
	
	ValidationDisplacement validation = new ValidationDisplacement();
	
	@Test(expected = ExceptionParkingEntrance.class)
	public void WhenEntranceVehicleWithDisplacementLessThanZeroThenExceptionParkingEntranceIsExpected() {
		double displacement = -1.0;
		Vehicle vehicle = new VehicleBuilder().withPlate("ABC123").withDisplacement(displacement).withTires(2).build();		
		
		validation.validate(vehicle);
	}
	
	@Test(expected = ExceptionParkingEntrance.class)
	public void WhenEntranceVehicleWithDisplacementEqulasThanZeroThenExceptionParkingEntranceIsExpected() {
		double displacement = 0.0;
		Vehicle vehicle = new VehicleBuilder().withPlate("ABC123").withDisplacement(displacement).withTires(2).build();		
		
		validation.validate(vehicle);
	}

	@Test(expected = Test.None.class)
	public void WhenEntranceVehicleWithTiresGreaterThanZeroThenNoExcepctionExpected() {
		double displacement = 250.0;
		Vehicle vehicle = new VehicleBuilder().withPlate("ABC123").withDisplacement(displacement).withTires(6).build();
		
		validation.validate(vehicle);
	}
	
}
