package src.main.java.com.daanan.zoosystem.animals;

public class Bird  extends Animal implements Flyable {
    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void movement() {
        System.out.println("The Bird Hops Along.");
    }

    @Override
    public void sound() {
        System.out.println("Tweet Tweet Tweet!");
    }

    @Override
    public void consume() {
        System.out.println("*peck*  *peck*  *peck*, bugs are tasty.");
    }

    @Override
    public void fly() {
        System.out.println("The Bird Flies!");
    }
}