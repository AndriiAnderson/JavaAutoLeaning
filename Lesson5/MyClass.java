//Class for Task15

package Lesson5;

public class MyClass {
    static int staticField;
    int dynamicField;

    public MyClass(int a, int b) {
        staticField = a;
        dynamicField = b;
    }
    static void change(MyClass obj) {

        obj.staticField = obj.staticField*10;
    }
    void anotherChange(MyClass obj) {

        obj.dynamicField = obj.dynamicField*10;
    }







}
