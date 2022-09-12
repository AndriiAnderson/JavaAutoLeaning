//Class for Task1

package Lesson7;

public class Bird implements Flyable {
    String type;

    Bird() {

        this.type = "Bird";
    }

    @Override
    public void fly() {

        System.out.println( type + " can fly!");
    }

}
