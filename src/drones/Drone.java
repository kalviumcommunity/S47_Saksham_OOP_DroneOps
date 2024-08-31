package src.drones;

public abstract class Drone {
    private String id;
    private int batteryLife;
    private String taskAssigned;
    private double speed; // Speed in km/h

    public Drone(String id, int batteryLife, double speed) {
        this.id = id;
        this.batteryLife = batteryLife;
        this.speed = speed;
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
}