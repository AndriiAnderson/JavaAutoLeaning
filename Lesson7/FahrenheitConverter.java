//Class for Task2

package Lesson7;

public class FahrenheitConverter implements Converter {

    @Override
    public double convert(double celsius) {

        return celsius * 1.8 + 32;
    }
}

