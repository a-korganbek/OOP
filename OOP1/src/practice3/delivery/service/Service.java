package practice3.delivery.service;

import practice3.delivery.model.Vehicle;
import practice3.delivery.model.*;
import java.util.List;

public class Service {

    public void printAllVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleInfo();
            System.out.println("---");
        }
    }
    
    double sum = 0;
    public void calculateAllDeliveries(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println("Delivery Cost for " + vehicle.getmodel() + ": " + vehicle.calculateDeliveryCost());
            if (vehicle instanceof Car) {
                System.out.println("With extra weight: " + ((Car) vehicle).calculateDeliveryCost(10));
                sum+=((Car) vehicle).calculateDeliveryCost(10);
            } 
            else if (vehicle instanceof Truck) {
                System.out.println("With distance and fuel: " + ((Truck) vehicle).calculateDeliveryCost(100.0, 10));
                sum+=((Truck) vehicle).calculateDeliveryCost(100, 10);
            }
            System.out.println("---");
        }
    }

    public void calculateTotalCost(List<Vehicle> vehicles) {
        double total = 0.0;
        for (Vehicle vehicle : vehicles) {
            total += vehicle.calculateDeliveryCost();
        }
        System.out.println(total+" or "+sum);
    }
    
}

