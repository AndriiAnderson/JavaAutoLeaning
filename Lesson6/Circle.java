//Class for Task5

package Lesson6;

public class Circle extends Figure {

    Circle(double radius) {

        super(radius);
    }
    @Override
    public double calculateArea() {

        return Math.PI*Math.pow(radius, 2);
    }
}

