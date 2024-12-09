package src.designPattern.strategy.withStrategy;

public class SportsVehicle extends Vehicle{

	public SportsVehicle() {
		super(new SportsDrive());
	}
	
}
