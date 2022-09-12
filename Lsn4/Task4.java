package Lesson4;

public class Task4 {

    public static void main(String args[]) {

        StaticCalculator sc1 = new StaticCalculator(100, 20 , "+");
        StaticCalculator sc2 = new StaticCalculator(100, 20 , "-");
        StaticCalculator sc3 = new StaticCalculator(100, 20 , "*");
        StaticCalculator sc4 = new StaticCalculator(100, 20 , "/");

        //Addition
        System.out.println(sc1.calculate());
        //Subtraction
        System.out.println(sc2.calculate());
        //Multiplication
        System.out.println(sc3.calculate());
        //Division
        System.out.println(sc4.calculate());
    }
}
