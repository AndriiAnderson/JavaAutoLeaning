//Class for Task7, Task8, Task9;

package Lesson5.packB;

import Lesson5.packA.ClassOne;

public class ClassThree {
    public static void main(String args[]) {
        ClassOne objTwo = new ClassOne();
        objTwo.str = "Test";
        objTwo.publicTest();
        System.out.println(objTwo.str);
    }
}
