package practice3.delivery.app;

import practice3.delivery.model.Car;
import practice3.delivery.model.Engine;
import practice3.delivery.model.Truck;
import practice3.delivery.model.Vehicle;
import practice3.delivery.service.Service;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine("Gasoline", 150);
        Engine engine2 = new Engine("Diesel", 300);

        Vehicle car = new Car("Toyota Camry", 1000.0, engine1, 5);
        Vehicle truck = new Truck("Ford F-150", 2000.0, engine2, 5000.0);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);

        Service service = new Service();
        System.out.println("All Vehicles Info:");
        service.printAllVehicles(vehicles);

        System.out.println("\nCalculate All Deliveries:");
        service.calculateAllDeliveries(vehicles);

        System.out.print("\nTotal Cost: ");
        service.calculateTotalCost(vehicles);
    }
}