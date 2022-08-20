package Lesson4;

public class Overload {

    public void ovlDemo() {
        System.out.println("Без параметрів");
    }
    public void ovlDemo(int а) {
        System.out.println("Один параметр" + а);
    }
    public int  ovlDemo(int а, int Ь) {
        System.out.println("Два параметри: " + а + "" + Ь);
        return а + Ь;
    }
    public double  ovlDemo(double а, double Ь) {
        System.out.println("Два параметри double: " + а + "" + Ь);
        return а + Ь;
    }
    }



