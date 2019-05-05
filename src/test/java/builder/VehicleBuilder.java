package builder;

import model.Vehicle;

public class VehicleBuilder {

	private String plate;	
	private double displacement;
	private int tires;
	
	public VehicleBuilder() {
		this.plate = "ABC123";		
		this.displacement = 500;
		this.tires = 4;
	}
	
	public Vehicle build() {
		return new Vehicle(plate, displacement, tires);
	}		
	
	public VehicleBuilder withPlate(String plate) {
		this.plate = plate;
		return this;
	}
	
	public VehicleBuilder withDisplacement(double displacement) {
		this.displacement = displacement;
		return this;
	}
	
	public VehicleBuilder withTires(int tires) {
		this.tires = tires;
		return this;
	}	
}
