package src.drones;

public class FastDrone extends Drone {
    public FastDrone(String id, int batteryLife, double speed) {
        super(id, batteryLife, speed);
    }

    @Override
    public void performTask() {
        System.out.println("Performing fast drone task.");
        // Additional logic for fast drone task can be added here
    }
}