package Lesson5;

public class Task13 {
    public static void main(String args[]) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        //1.Статична змінна задається як член классу, без прив'язки до якогось об'єкту
        StaticDemo.y = 100;

        obj1.x = 10;
        obj2.x = 20;

        //2. Статична змінна однакова для всіх об'єктів
        System.out.println(obj1.sum());
        System.out.println(obj2.sum());
    }
}

