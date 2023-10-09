package com.myzoo;

import src.main.java.com.daanan.zoosystem.animals.Animal;
import src.main.java.com.daanan.zoosystem.animals.Lion;
import src.main.java.com.daanan.zoosystem.facilites.Facility;
import src.main.java.com.daanan.zoosystem.management.Zoo;
import src.main.java.com.daanan.zoosystem.staff.Staff;

public class Main {
    public static void main(String[] args) {

        // Testing Animal
        Animal lion = new Lion("Larry");
        lion.movement();
        lion.sound();
        lion.consume();

        // Testing Staff
        Staff staff = new Staff("Stan");
        staff.assignShift("Day");
        staff.assignDuty("Clean washrooms 1");
        staff.assignDuty("Clean washrooms 2");
        staff.assignDuty("Clean washrooms 3");
        staff.assignDuty("Clean washrooms 4");
        staff.printDuties();
        staff.work();
        staff.printDuties();

        // Testing Facility
        Facility lionFacility = new Facility("Lion Enclosure", 5);
        lionFacility.printAnimalsInEnclosure();
        lionFacility.scheduleMaintenance(staff);
        staff.printDuties();
        lionFacility.isAvailable();


        staff.printDetails();





        Zoo calgaryZoo = new Zoo("Calgary Zoo");

//
//
//        Animal aLion = new Lion("a lion");
//        Animal aElephant = new Elephant("a elephant");
//        Animal aBird = new Bird("a bird");
//        Flyable flyingBird = new Bird("flying bird");
//
//        Lion lion0 = new Lion("lion 1");
//        Lion lion1 = new Lion("lion 2");
//        Lion lion2 = new Lion("lion 3");
//        Elephant elephant0 = new Elephant("elephant 1");
//        Elephant elephant1 = new Elephant("elephant 2");
//        Elephant elephant2 = new Elephant("elephant 3");
//        Bird bird0 = new Bird("bird 1");
//        Bird bird1 = new Bird("bird 2");
//        Bird bird2 = new Bird("bird 3");
//
//        Staff staff = new Staff("Daanan");
//        staff.assignShift("day");
////        staff.assignDuty("Clean lions cage");
////        staff.assignDuty("sweep grounds");
////        staff.assignDuty("Clean elephants cage");
////        staff.assignDuty("Clean birds cage");
////        staff.assignDuty("Clean washrooms");
////        staff.assignDuty("Clean Monkey cage");
////        staff.assignDuty("Clean bears cage");
////        staff.assignDuty("Clean wolves cage");
//
//        Facility lionFacility = new Facility("Lion Enclosure", 8);
//        Facility elephantFacility = new Facility("Elephant Enclosure", 5);
//        Facility birdFacility = new Facility("Bird Enclosure", 30);
//
//        zoo.addFacility(lionFacility);
//        zoo.addFacility(elephantFacility);
//        zoo.addFacility(birdFacility);
//
//        zoo.addAnimal(lion0, lionFacility);
//        zoo.addAnimal(lion1, lionFacility);
//        zoo.addAnimal(lion2, lionFacility);
//        zoo.addAnimal(aLion, lionFacility);
//
//        zoo.addAnimal(elephant0, elephantFacility);
//        zoo.addAnimal(elephant1, elephantFacility);
//        zoo.addAnimal(elephant2, elephantFacility);
//        zoo.addAnimal(aElephant, elephantFacility);
//        zoo.addAnimal(elephant2, elephantFacility);
//
//        zoo.addAnimal(bird0, birdFacility);
//        zoo.addAnimal(bird1, birdFacility);
//        zoo.addAnimal(bird2, birdFacility);
//        zoo.addAnimal(aBird, birdFacility);
//        zoo.addAnimal((Animal) flyingBird, birdFacility);
//
//        zoo.printAllAnimalsAtZoo();
//        zoo.scheduleMaintenance(birdFacility, staff);
//
//        zoo.addAnimal(new Elephant("Billy"), elephantFacility);


    }
}
