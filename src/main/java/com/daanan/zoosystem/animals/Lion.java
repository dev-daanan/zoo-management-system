package src.main.java.com.daanan.zoosystem.animals;

public class Lion extends Animal {
    public Lion(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Lion(String name) {
        super(name);
    }

    @Override
    public void movement() {
        System.out.println("The Lion Confidently Struts.");
    }

    @Override
    public void sound() {
        System.out.println("ROAR, ROAR, ROARS!");
    }

    @Override
    public void consume() {
        System.out.println("*nom*  *nom*  *nom*, tourists are easy prey.");
    }
}
