package src.main.java.com.daanan.zoosystem.animals;

public abstract class Animal {
    String name;
    int age;
    double weight;

    abstract void movement();
    abstract void sound();
    abstract void consume();
}
