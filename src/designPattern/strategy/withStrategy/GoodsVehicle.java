package src.designPattern.strategy.withStrategy;

public class GoodsVehicle extends Vehicle{

	public GoodsVehicle() {
		super(new NormalDrive());
	}
}
