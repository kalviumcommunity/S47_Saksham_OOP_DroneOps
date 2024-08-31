package src.drones;

public class NormalDrone extends Drone {
    public NormalDrone(String id, int batteryLife, double speed) {
        super(id, batteryLife, speed);
    }

    @Override
    public void performTask() {
        System.out.println("Performing normal drone task.");
        // Additional logic for normal drone task can be added here
    }
}