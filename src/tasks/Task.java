package src.tasks;

public class Task {
    private String taskId;
    private String description;
    private boolean isFulfilled;
    private double distance; // Distance in km
    private double progress; // Progress percentage

    public Task(String taskId, String description, double distance) {
        this.taskId = taskId;
        this.description = description;
        this.distance = distance;
        this.isFulfilled = false;
        this.progress = 0.0;
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
}