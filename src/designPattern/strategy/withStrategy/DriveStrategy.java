package src.designPattern.strategy.withStrategy;

/*
 *Introducing the interface so that 2 strategy can be created and implement this method.
 *
 * Iss pattern ka logic ye hai ki
 * multiple childs are using same logic.
 * So instead of defining 1 method in parent and again overriding per child,
 * it will result in duplicate code.
 * 
 * this can be avoided by using this design pattern.
 * 
 * eg- sportsVehicle and offRoadVehicle -> both are using sportsDrive strategy
 * meanwhile GoodsVehicle is using normalDrive strategy
 * 
 * 
 * */


public interface DriveStrategy {
	
	void drive();

}
