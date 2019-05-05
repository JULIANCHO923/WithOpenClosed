package exception;

public class ExceptionParkingEntrance extends RuntimeException{

	
	private static final long serialVersionUID = 1L;

	public ExceptionParkingEntrance(String mensaje){
		super(mensaje);		
	}
	
}
