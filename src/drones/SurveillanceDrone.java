package src.drones;

public class SurveillanceDrone extends Drone {
    public SurveillanceDrone(String id, int batteryLife, double speed) {
        super(id, batteryLife, speed);
    }

    @Override
    public void performTask() {
        System.out.println("Performing surveillance task.");
        // Additional logic for surveillance task can be added here 
    }
}