//Class for Task3

package Lesson6;

public class Truck extends Vehicle {
    private int currentCargo;

    public Truck(String name, String size, int currentCargo) {
        super(name, size);
        this.currentCargo = 0;
    }

    public void loading(int cargo) {
        currentCargo = cargo;
        System.out.println("The current cargo is : " + currentCargo);
    }



}
