package Lesson8;

import Test8.MyCustemException;

public class Task5 {
    public static void iCanThrowException(String argument) {
        if(argument.isEmpty())
            throw new NullPointerException();
    }
    public static void main(String[] args) {
        try {
            iCanThrowException("");
        }
        catch (NullPointerException exc){
            System.out.println("Exception's caught!");
            exc.printStackTrace();
        }
    }
}
