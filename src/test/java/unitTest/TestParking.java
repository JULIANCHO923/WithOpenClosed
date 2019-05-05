package unitTest;

import org.junit.Before;
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import builder.VehicleBuilder;
import exception.ExceptionParkingEntrance;
import model.Vehicle;
import parking.Parking;
import validation.Validations;

public class TestParking {
	
	public Parking parking;
	
	public String correctCarPlate;
	public double correctDisplacement;
	public int correctTires;
	
	public double incorrectDisplacement;
	public int incorrectTires;
	
	
	@Before
	public void data(){
		parking = new Parking(new Validations());
		
		correctCarPlate = "BBC223";
		correctDisplacement = 100.0;
		correctTires = 4;
		
		incorrectDisplacement = 0.0;
		incorrectTires = 12;	
	}
	
	
	@Test(expected = Test.None.class)
	public void WhenVehicleSatisfyConditionOfEntranceThenExceptionIsNOTExpected() {
		Vehicle allowedVehicle = new VehicleBuilder().withPlate(correctCarPlate).withDisplacement(correctDisplacement).withTires(correctTires).build();
		parking.allowVehicleEntrance(allowedVehicle);
	}
	
	@Test(expected = ExceptionParkingEntrance.class)
	public void WhenVehicleHaveIncorrectDisplacementInEntranceThenExceptionParkingEntranceIsExpected() {		
		Vehicle negatedVehicle = new VehicleBuilder().withPlate(correctCarPlate).withDisplacement(incorrectDisplacement).withTires(correctTires).build();
		parking.allowVehicleEntrance(negatedVehicle);
	}
	
	@Test(expected = ExceptionParkingEntrance.class)
	public void WhenVehicleHaveIncorrectTiresInEntranceThenExceptionParkingEntranceIsExpected() {
		Vehicle negatedVehicle = new VehicleBuilder().withPlate(correctCarPlate).withDisplacement(correctDisplacement).withTires(incorrectTires).build();
		parking.allowVehicleEntrance(negatedVehicle);
	}
	
}
