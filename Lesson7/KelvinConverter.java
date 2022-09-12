//Class for Task2

package Lesson7;

public class KelvinConverter implements Converter {

    double kelvin;

    @Override
    public double convert(double celsius) {

        return celsius + 273.15;
    }
}

