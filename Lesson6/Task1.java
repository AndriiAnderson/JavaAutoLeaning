package Lesson6;

public class Task1 {
    public static void main(String args[]) {
        Date d1 = new Date(2000, "Jan", 1 );
        Address a1 = new Address("Kiyv", "Tolochina", 1);
        Client cl1 = new Client("John", d1, a1);

        System.out.println(cl1);
    }
}
