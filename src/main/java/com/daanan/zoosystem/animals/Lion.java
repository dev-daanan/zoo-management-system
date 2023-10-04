package src.main.java.com.daanan.zoosystem.animals;

public class Lion extends Animal {
    @Override
    void movement() {
        System.out.println("The Lion Confidently Struts.");
    }

    @Override
    void sound() {
        System.out.println("ROAR, ROAR, ROARS!");
    }

    @Override
    void consume() {
        System.out.println("*nom*  *nom*  *nom*, tourists are easy prey.");
    }
}
