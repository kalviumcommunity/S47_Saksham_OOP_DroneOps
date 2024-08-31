package src.drones;

public class DeliveryDrone extends Drone {
    public DeliveryDrone(String id, int batteryLife, double speed) {
        super(id, batteryLife, speed);
    }

    @Override
    public void performTask() {
        System.out.println("Performing delivery task.");
        // Additional logic for delivery task can be added here
    }
}