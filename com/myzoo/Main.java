package com.myzoo;

import src.main.java.com.daanan.zoosystem.staff.Staff;

public class Main {
    public static void main(String[] args) {
//        Animal aLion = new Lion();
//        Animal aElephant = new Elephant();
//        Animal aBird = new Bird();
//        Flyable flyingBird = new Bird();
//
//        System.out.println("-".repeat(50));
//        System.out.println("--Animal--".repeat(5));
//        aLion.movement();
//        aElephant.movement();
//        aBird.movement();
//        flyingBird.fly();
//
//        System.out.println("-".repeat(50));
//        System.out.println("--SubClasses--".repeat(5));
//        Lion lion = new Lion();
//        Elephant elephant = new Elephant();
//        Bird bird = new Bird();
//        lion.movement();
//        elephant.movement();
//        bird.movement();

        Staff staff = new Staff("Daanan");
        staff.assignShift("day");
        staff.assignDuty("Clean lions cage");
        staff.assignDuty("sweep grounds");
        staff.assignDuty("Clean elephants cage");
        staff.assignDuty("Clean birds cage");
        staff.assignDuty("Clean washrooms");
        staff.assignDuty("Clean Monkey cage");
        staff.assignDuty("Clean bears cage");
        staff.assignDuty("Clean wolves cage");

        staff.printDuties();
        staff.work();
        staff.printDuties();





        System.out.println("-".repeat(50));

    }
}
