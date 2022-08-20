package Lesson4;

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public int total;

    public Boxer (int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
        this.total = this.strength + this.weight - this.age;
    }

    boolean fight (Boxer anotherBoxer) {
        if (total > anotherBoxer.total)  return  true;
        else  return  false;
    }
}
