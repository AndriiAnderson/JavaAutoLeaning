

package Lesson4;

public class Task4 {

    public static void main(String args[]) {

        StaticCalculator sC1 = new StaticCalculator(1, 1 , "Sum1");
        StaticCalculator sC2 = new StaticCalculator(2, 2 , "Sum2");
        //StaticCalculator sC3 = new StaticCalculator(2, 2 );

        System.out.println( sC1.str + " = " + sC1.calculate());
        System.out.println( sC2.str + " = " + sC2.calculate());

    }
}
