package Lesson4;

public class StaticCalculator {
    double firstValue;
    double secondValue;
    String str;

    StaticCalculator (double fV, double sV, String s) {

        firstValue = fV;
        secondValue = sV;
        str = s;

    }

    double calculate() {

        return firstValue + secondValue;



    }
}
