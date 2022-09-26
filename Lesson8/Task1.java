package Lesson8;

public class Task1 {
    static void checkNumber(int number) throws MyOwnException {
        if(number == 0) {
            System.out.println("Number equal 0");
            throw new MyOwnException(number);
        } else if (number < 0) {
            System.out.println("Number less than 0");
        } else {
            System.out.println("Number more than 0");
        }
        System.out.println("Ok");
    }
    public static void main(String args[]) {
        try {
            checkNumber(-1);
            checkNumber(0);
            checkNumber(1);
        }
        catch (MyOwnException exc) {
            System.out.println("Exception's caught!");
        }
        catch (ArithmeticException exc) {
            System.out.println("Exception's caught!");
        }
        catch (Exception exc) {
            System.out.println("Exception's caught!");
        }
    }
}
