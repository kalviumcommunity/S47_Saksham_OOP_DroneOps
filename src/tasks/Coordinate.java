package src.tasks;

public class Coordinate {
    // Private fields for encapsulation
    private int x;
    private int y;

    // Constructor to initialize the coordinates
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Public getter for x
    public int getX() {
        return x;
    }

    // Public setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Public getter for y
    public int getY() {
        return y;
    }

    // Public setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Method to display the coordinate
    public void display() {
        System.out.println("Coordinate: (" + x + ", " + y + ")");
    }
}