//Class for Task3

package Lesson7;

public class MyDevice implements State, Volume2 {

    @Override
    public void on() {

        System.out.println("Powered On");
    }

    @Override
    public void off() {

        System.out.println("Powered Off");
    }

    public void changeVolume(double value) {

        System.out.println("Changing volume to " + value);
    }

}
