package src.designPattern.strategy.withStrategy;

public class OffRoadVehicle extends Vehicle{

	public OffRoadVehicle() {
		super(new SportsDrive());
	}
}
