

package Lesson4;

public class Task10 {
    public static void main(String[] args) {
        Overload оЬj = new Overload();

        int resultInt;
        double resultDbl;

        оЬj.ovlDemo();
        resultInt = оЬj.ovlDemo(2, 3);
        System.out.println(resultInt);
        оЬj.ovlDemo(2.1,3.6);
        resultDbl = оЬj.ovlDemo(2.2,3.3);
        System.out.println(resultDbl);
    }
}
