package src.designPattern.strategy;

import src.designPattern.strategy.withStrategy.OffRoadVehicle;
import src.designPattern.strategy.withStrategy.Vehicle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize as per your need
		Vehicle vehicle = new OffRoadVehicle();
		
		vehicle.drive();

	}

}
