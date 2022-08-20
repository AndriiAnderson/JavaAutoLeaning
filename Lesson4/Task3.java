

package Lesson4;

public class Task3 {
    public static void main(String[] args) {
        Modification modification = new Modification("sedan", "V6", 220 );

        //Реалiзацiя uses-a
        Car BMW = new Car(modification);

        //Реалiзацiя has-a
        System.out.println(BMW.modification.kuzov);
        System.out.println(BMW.modification.engine);
        System.out.println(BMW.modification.maxSpeed);

       }
}
