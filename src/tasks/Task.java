package src.tasks;

public class Task {
    private String taskId;
    private String description;
    private boolean isFulfilled;
    private double distance; // Distance in km
    private double progress; // Progress percentage
    // Static variable to track the total number of tasks
    private static int totalTasks = 0;

    public Task(String taskId, String description, double distance) {
        this.taskId = taskId;
        this.description = description;
        this.distance = distance;
        this.isFulfilled = false;
        this.progress = 0.0;
        totalTasks++; // Increment the total number of tasks
    }

    public String getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFulfilled() {
        return isFulfilled;
    }

    public void fulfillTask() {
        this.isFulfilled = true;
    }

    public double getDistance() {
        return distance;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    // Static method to get the total number of tasks
    public static int getTotalTasks() {
        return totalTasks;
    }
}