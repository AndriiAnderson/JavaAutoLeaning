package Lesson6;

public class Task5 {
    public static void main(String args[]) {

        Triangle tr1 = new Triangle(2, 3);
        tr1.calculateArea();
        System.out.println("The area of triangle: " + tr1.calculateArea());

        Rectangle rc1 = new Rectangle(3, 4);
        rc1.calculateArea();
        System.out.println("The area of rectangle: " + rc1.calculateArea());

        Circle cir1 = new Circle(10);
        cir1.calculateArea();
        System.out.println("The area of circle: " + cir1.calculateArea());
    }
}
