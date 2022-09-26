package Lesson8;

public class Task3 {
    public static void main(String args[]) {
        try {
            int a = args.length;
            int b = 10 / a;
        }
        catch (ArithmeticException exc){
            System.out.println("Exception's caught!");
            System.out.println("Division by zero isn't allowed!");
            System.out.println(exc);
            exc.printStackTrace();
        }
        try{
            int[] c = {1};
            System.out.println(c[1]);
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Exception's caught!");
            System.out.println("Out of array!");
            System.out.println(exc);
            exc.printStackTrace();
        }
    }
}
