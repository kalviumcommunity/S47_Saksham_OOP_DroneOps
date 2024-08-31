package src;

import src.drones.*;
import src.tasks.*;

public class Main {
    public static void main(String[] args) {
        // Create some drone objects
        SurveillanceDrone surveillanceDrone = new SurveillanceDrone("SD001", 100, 50.0);
        DeliveryDrone deliveryDrone = new DeliveryDrone("DD001", 100, 30.0);

        // Create some task objects
        Task task1 = new Task("T001", "Surveillance of area A", 10.0);
        Task task2 = new Task("T002", "Delivery to location B", 20.0);

        // Assign tasks to drones
        surveillanceDrone.setTaskAssigned(task1.getDescription());
        deliveryDrone.setTaskAssigned(task2.getDescription());

        // Perform tasks
        surveillanceDrone.performTask();
        deliveryDrone.performTask();

        // Print task progress
        System.out.println("Task 1 Progress: " + task1.getProgress() + "%");
        System.out.println("Task 2 Progress: " + task2.getProgress() + "%");
    }
}