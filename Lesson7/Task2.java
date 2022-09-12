package Lesson7;

public class Task2 {
    public  static  void  main(String  args[]) {
        KelvinConverter kelvin1 = new KelvinConverter();
        FahrenheitConverter fahr1 = new FahrenheitConverter();

        System.out.println(kelvin1.convert(100));
        System.out.println(fahr1.convert(100));
    }
}
