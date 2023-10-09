package src.main.java.com.daanan.zoosystem.animals;

public class Elephant extends Animal {
    public Elephant(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void movement() {
        System.out.println("The Elephant Slowly Walks.");
    }

    @Override
    public void sound() {
        System.out.println("TRUMPET, TRUMPET, TRUMPETS!");
    }

    @Override
    public void consume() {
        System.out.println("*nom*  *nom*  *nom*, greens are yummy.");
    }
}
