//Class for Task1

package Lesson8;

public class MyOwnException extends Exception {
    int value;
    public MyOwnException(int number) {

        value = number;
    }
    public String toString() {

        return "MyOwnException(" + value + ")";
    }
}
