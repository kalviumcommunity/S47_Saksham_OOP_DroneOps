package src.fleet;

import src.drones.*;
import src.tasks.*;

public class FleetManager {
    private Drone[] drones;
    private int droneCount;

    public FleetManager(int maxDrones) {
        this.drones = new Drone[maxDrones];
        this.droneCount = 0;
    }

    // Add a drone to the fleet
    public boolean addDrone(Drone drone) {
        if (droneCount < drones.length) {
            drones[droneCount++] = drone;
            return true;
        }
        return false;
    }

    // Assign a task to a drone
    public boolean assignTaskToDrone(String droneId, Task task) {
        for (int i = 0; i < droneCount; i++) {
            if (drones[i].getId().equals(droneId) && drones[i].getTaskAssigned() == null) {
                drones[i].setTaskAssigned(task.getDescription());
                task.setProgress(0.0); // Reset task progress
                return true;
            }
        }
        return false;
    }

    // Get the status of all drones
    public String[] getAllDronesStatus() {
        String[] statusList = new String[droneCount];
        for (int i = 0; i < droneCount; i++) {
            String status = "Drone ID: " + drones[i].getId() +
                            ", Battery Life: " + drones[i].getBatteryLife() +
                            ", Speed: " + drones[i].getSpeed() +
                            ", Task Assigned: " + (drones[i].getTaskAssigned() != null ? drones[i].getTaskAssigned() : "None");
            statusList[i] = status;
        }
        return statusList;
    }

    // Get the number of drones in the fleet
    public int getNumberOfDrones() {
        return droneCount;
    }
}