package Lesson5;

import  Lesson5.packA.*;
import  Lesson5.packB.*;

public class Task6 {
    public static void main(String args[]) {
        /*
        Помилка!
        Неможливо створити жоден з об'єктів

        ClassA objA = new ClassA(1);
        ClassA objB = new ClassA("test");
         */

        Lesson5.packA.ClassA objA = new Lesson5.packA.ClassA(1);
        System.out.println(objA.x);

        Lesson5.packB.ClassA objB = new Lesson5.packB.ClassA("test");
        System.out.println(objB.str);
    }
}
