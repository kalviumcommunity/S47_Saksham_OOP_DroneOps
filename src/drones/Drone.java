package src.drones;

public abstract class Drone {
    private String id;
    private int batteryLife;
    private String taskAssigned;
    private double speed; // Speed in km/h
    // Static variable to track the total number of drones
    private static int totalDrones = 0;

    public Drone(String id, int batteryLife, double speed) {
        this.id = id;
        this.batteryLife = batteryLife;
        this.speed = speed;
        totalDrones++; // Increment the total number of drones
    }

    public String getId() {
        return id;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getTaskAssigned() {
        return taskAssigned;
    }

    public void setTaskAssigned(String taskAssigned) {
        this.taskAssigned = taskAssigned;
    }

    public double getSpeed() {
        return speed;
    }

    public abstract void performTask();

    // Static method to get the total number of drones
    public static int getTotalDrones() {
        return totalDrones;
    }
}