//Class for Task7, Task8, Task9;

package Lesson5.packA;

public class ClassOne {
    int x;
    public String str;
    private String prvt;
    protected String prot;
    void packagePrivateTest() {
        System.out.println("It has package-private access!");
    }
    public void publicTest() {
        System.out.println("It has public access!");
    }
    private void privateTest() {
        System.out.println("It has private access!");
    }
}
