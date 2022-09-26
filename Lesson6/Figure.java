//Class for Task5

package Lesson6;

public abstract class Figure {
    double width;
    double height;
    double radius;

    Figure(double width, double height) {
        this.width = width;
        this.height = height;
    }
    Figure(double radius) {

        this.radius = radius;
    }

    public abstract double calculateArea();
}
