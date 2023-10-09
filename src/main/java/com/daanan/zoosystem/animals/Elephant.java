package src.main.java.com.daanan.zoosystem.animals;

public class Elephant extends Animal {
    @Override
    public void movement() {
        System.out.println("The Elephant Slowly Walks.");
    }

    @Override
    void sound() {
        System.out.println("TRUMPET, TRUMPET, TRUMPETS!");
    }

    @Override
    void consume() {
        System.out.println("*nom*  *nom*  *nom*, greens are yummy.");
    }
}
