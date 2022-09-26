//Class for Task3

package Lesson6;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;
    private int currentGear;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection = 0;
        this.currentVelocity = 0;
        this.currentGear = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Steering at" + " " + currentDirection + " " + "degree.");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Moving at" + " " + currentVelocity + " " + "in direction" + " " + currentDirection);
    }

    public void increasingSpeed(int increment) {

        this.currentVelocity += increment;
        System.out.println("The car's moving at :" + currentVelocity);
    }

    public void decreasingSpeed(int decrement){

        this.currentVelocity -= decrement;
        System.out.println("The car's moving at :" + currentVelocity);
    }

    public void changeGear(int gear){

        this.currentGear = gear;
        System.out.println("The gear's changed to: " + currentGear);
    }

    public void stop() {
        this.currentVelocity = 0;
        System.out.println("The car's stopped!");
    }

    public String getName() {

        return name;
    }

    public String getSize() {

        return size;
    }

    public int getCurrentVelocity() {

        return currentVelocity;
    }

    public int getCurrentDirection() {

        return currentDirection;
    }
}
