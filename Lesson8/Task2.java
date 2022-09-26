package Lesson8;

public class Task2 {
    public static int divideByZero() {
        int a = 5;
        int b = 0;
        return a / b;
    }

    public static void main(String args[]) {
        try {
            System.out.println(divideByZero());
        }
        catch (ArithmeticException exc) {
            System.out.println("Exception's caught!");
            System.out.println("Division by zero isn't allowed!");
        }
    }
}
