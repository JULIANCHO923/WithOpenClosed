package unitTest;

import org.junit.Test;

import builder.VehicleBuilder;
import exception.ExceptionParkingEntrance;
import model.Vehicle;
import validation.ValidationTires;


public class TestValidationTires {
	
	ValidationTires validation = new ValidationTires();
	
	@Test(expected = ExceptionParkingEntrance.class)
	public void WhenEntranceVehicleWithTiresGreaterThanSixThenExceptionParkingEntranceIsExpected() {
		int tires = 8;
		Vehicle vehicle = new VehicleBuilder().withPlate("ABC123").withDisplacement(100.0).withTires(tires).build();		
		validation.validate(vehicle);
	}

	@Test(expected = Test.None.class)
	public void WhenEntranceVehicleWithTiresLessThanSixThenExceptionIsNOTExpected() {
		int tires = 4;
		Vehicle vehicle = new VehicleBuilder().withPlate("ABC123").withDisplacement(100.0).withTires(tires).build();
		validation.validate(vehicle);
	}
	
	@Test(expected = Test.None.class)
	public void WhenEntranceVehicleWithTiresEqualsThanSixThenExceptionIsNOTExpected() {
		int tires = 6;
		Vehicle vehicle = new VehicleBuilder().withPlate("ABC123").withDisplacement(100.0).withTires(tires).build();
		validation.validate(vehicle);
	}
	
}
