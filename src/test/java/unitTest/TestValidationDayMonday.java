package unitTest;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import builder.VehicleBuilder;
import exception.ExceptionParkingEntrance;
import model.Vehicle;
import parking.DateToday;
import validation.ValidationDayMonday;

public class TestValidationDayMonday {

	DateToday dateToday = Mockito.mock(DateToday.class);
	ValidationDayMonday validation = new ValidationDayMonday(dateToday);

	ExpectedException exceptionRule = ExpectedException.none();
	
	@Test(expected = ExceptionParkingEntrance.class)
	public void WhenDayIsMondayAndVehicleWithPlateBeginInAThenExceptionParkingEntranceIsExpected() {
		boolean isMonday = true;
		String plateBeginA = "ABC123";
		Vehicle vehicle = new VehicleBuilder().withPlate(plateBeginA).withDisplacement(100.0).withTires(4).build();		
		when(dateToday.isMonday()).thenReturn(isMonday);
		
		validation.validate(vehicle);
		
		verify(dateToday).isMonday();
	}

	@Test(expected = Test.None.class)
	public void WhenDayNotIsMondayAndVehicleWithPlateBeginInAThenExceptionIsNoTExpected() {
		boolean isMonday = false;
		String plateBeginA = "ABC123";
		Vehicle vehicle = new VehicleBuilder().withPlate(plateBeginA).withDisplacement(100.0).withTires(4).build();		
		when(dateToday.isMonday()).thenReturn(isMonday);
		
		validation.validate(vehicle);
		
		verify(dateToday).isMonday();
	}

	@Test
	public void EntranceVehicleWithoutPlateBeginAOnDifferentDay() {
		String plateBeginA = "JCÑ456";
		Vehicle vehicle = new VehicleBuilder().withPlate(plateBeginA).withDisplacement(100.0).withTires(4).build();

		boolean isMonday = false;
		when(dateToday.isMonday()).thenReturn(isMonday);
		
		exceptionRule.expect(Test.None.class);		
		validation.validate(vehicle);
	}
	
	@Test
	public void EntranceVehicleWithoutPlateBeginAOnMonday() {
		String plateNotBeginA = "JHD765";
		Vehicle vehicle = new VehicleBuilder().withPlate(plateNotBeginA).withDisplacement(100.0).withTires(4).build();

		boolean isMonday = true;
		when(dateToday.isMonday()).thenReturn(isMonday);

		try {
			validation.validate(vehicle);
		} catch (ExceptionParkingEntrance e) {
			fail();
		}
	}

}
