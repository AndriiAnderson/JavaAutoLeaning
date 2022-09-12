//Class for Task1

package Lesson7;

public class Duck implements Flyable {
    String type;

    Duck() {

        this.type = "Duck";
    }
    @Override
    public void fly() {
            System.out.println( type + " can fly!");
    }

}
