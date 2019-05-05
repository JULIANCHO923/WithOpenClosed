package model;

public class Vehicle {

	
	
	private String plate;
	private double displacement;
	private int tires; // Usar Protected
	
	/**
	 * Protected Vehicle ( Placa, Cilindraje, #llantas)
	 * 
	 * Camion hereda de Vehiculo 
	 * Camion (plca, cilindraje): Base (Placa, Cilindraje, #llantas)
	 * 
	 * Si necesito más validaciones (se crea en el camion) 
	 * 
	 */
	public Vehicle(String plate, double displacement, int tires){
		this.plate = plate;
		this.displacement = displacement;	
		this.tires = tires;
	}

	public String getPlate() {
		return plate;
	}

	public double getDisplacement() {
		return displacement;
	}

	public int getTires() {
		return tires;
	}
		
}
