//Class for Task4

package Lesson6;

public class Animal {
    private String name;
    private int weight;
    private int age;

    Animal(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void makeSound() {

        System.out.println("The animal is making a sound...");
    }

    public void sleep() {

        System.out.println("The animal is sleeping...");
    }
}
