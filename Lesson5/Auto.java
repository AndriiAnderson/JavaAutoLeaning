//Class for Task10

package Lesson5;

public class Auto {
    private Auto() {
    }
    public static Auto createAuto() {
        return new Auto();
    }
    public void fullThrottle() {
        System.out.println("The auto is going as fast as it can!");
    }
}
