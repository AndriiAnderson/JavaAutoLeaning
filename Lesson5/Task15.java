package Lesson5;

public class Task15 {
    public static void main(String args[]) {

        MyClass myC1 = new MyClass(10,100);
        System.out.println(MyClass.staticField);
        System.out.println(myC1.dynamicField);


        MyClass.change(myC1);
        System.out.println(MyClass.staticField);

        myC1.anotherChange(myC1);
        System.out.println(myC1.dynamicField);
    }
}
