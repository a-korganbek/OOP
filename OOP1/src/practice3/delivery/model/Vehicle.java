package practice3.delivery.model;
public abstract class Vehicle{
	protected String model;
    protected double baseCost;
    protected Engine engine; 
    public Vehicle(String model, double baseCost, Engine engine) { 
        this.model = model;
        this.baseCost = baseCost;
        this.engine = engine;
    }
    
    public abstract double calculateDeliveryCost();
    public void getVehicleInfo() {
        System.out.println("Model: " + model + ", Base Cost: " + baseCost);
        engine.getEngineInfo();  
    }
    public String getmodel() {
    	return model;
    }
}