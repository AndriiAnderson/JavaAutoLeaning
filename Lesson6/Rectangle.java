//Class for Task5

package Lesson6;

public class Rectangle extends Figure {

    Rectangle(double width, double height) {

        super(width, height);
    }

    @Override
    public double calculateArea() {

        return width * height;
    }
}
