

//Class for Task5

package Lesson4;

public class Dog {
    int age;
    int weight;
    String name;

    public Dog(String name) {
        this.name = name;
        System.out.println("The first constructor");
    }

    public Dog(String name, int age )  {
        this(name);
        this.age = age;
        System.out.println("The second constructor");
    }

    public Dog(String name, int age, int weight )  {
        this(name, age);
        this.weight = weight;
        System.out.println("The third constructor");
    }
}
