//Class for Task5

package Lesson6;

public class Triangle extends Figure {
    Triangle(double width, double height) {

        super(width,height);
    }

    @Override
    public double calculateArea() {

        return width * height / 2;
    }




}
