//Class for Task4

package Lesson6;

public class Cat extends Animal {

    Cat(String name, int weight, int age) {

        super(name, weight, age);
    }

    @Override
    public void makeSound(){

        System.out.println("Meow");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Zzz");
    }
}


