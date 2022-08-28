package Lesson5;

public class Task5 {
    public static void main(String args[]) {

        Lesson5.packA.ClassA objA = new Lesson5.packA.ClassA(1);
        System.out.println(objA.x);

        Lesson5.packB.ClassA objB = new Lesson5.packB.ClassA("test");
        System.out.println(objB.str);

    }
}

