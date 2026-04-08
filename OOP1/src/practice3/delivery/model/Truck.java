package practice3.delivery.model;
public class Truck extends Vehicle{
	private double maxLoad;
	public Truck(String model, double baseCost, Engine engine,double maxLoad) {
		super(model,baseCost,engine);
		this.maxLoad = maxLoad;
	}
	@Override
    public double calculateDeliveryCost() {
        return baseCost * 1.5;  
    }
	 public double calculateDeliveryCost(double distance,double fuelPrice) {
		return calculateDeliveryCost()+ (distance*fuelPrice);
	}
	@Override
	public  void getVehicleInfo() {
		super.getVehicleInfo();
		System.out.println("MaxLoad:"+maxLoad);
	}
}