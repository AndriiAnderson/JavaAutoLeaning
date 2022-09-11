package Lesson6;

public class Task3 {
    public static void main(String args[]) {
        Truck tr1 = new Truck("Scaian", "large", 0);
        tr1.loading(100);
        tr1.steer(10);
        tr1.move(100,30);
        tr1.increasingSpeed(50);
        tr1.decreasingSpeed(30);
        tr1.changeGear(3);
        tr1.stop();
        System.out.println(tr1.getCurrentVelocity());
        System.out.println(tr1.getCurrentDirection());
    }
}
