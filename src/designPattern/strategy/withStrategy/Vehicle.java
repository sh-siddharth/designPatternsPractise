package src.designPattern.strategy.withStrategy;

public class Vehicle {

	private DriveStrategy driveStrategy;
	
	Vehicle(DriveStrategy driveStrategy){
		this.driveStrategy = driveStrategy;
	}
	
	public void drive() {
		driveStrategy.drive();
	}
}
