package src.main.java.com.daanan.zoosystem.animals;

public class Bird  extends Animal implements flyable{
    @Override
    void movement() {
        System.out.println("The Bird Hops Along.");
    }

    @Override
    void sound() {
        System.out.println("Tweet Tweet Tweet!");
    }

    @Override
    void consume() {
        System.out.println("*peck*  *peck*  *peck*, bugs are tasty.");
    }

    @Override
    public void fly() {
        System.out.println("The Bird Flies!");
    }
}