//Class for Task4

package Lesson4;

public class StaticCalculator {
    double firstValue;
    double secondValue;
    String str;

    StaticCalculator(double fV, double sV, String s) {
        firstValue = fV;
        secondValue = sV;
        str = s;
    }

    double calculate() {
        switch (this.str) {
            case "+":
                return this.firstValue + this.secondValue;
            case "-":
                return this.firstValue - this.secondValue;
            case "*":
                return this.firstValue * this.secondValue;
            case "/":
                return this.firstValue / this.secondValue;
            default:
                return 0;
        }
    }
}
