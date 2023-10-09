package src.main.java.com.daanan.zoosystem.facilites;

import src.main.java.com.daanan.zoosystem.animals.Animal;
import src.main.java.com.daanan.zoosystem.staff.Staff;

import java.util.ArrayList;

public class Facility {
    String facilityType; //  (such as 'Enclosure', 'Cafeteria', 'Restroom', etc.)
    ArrayList<Animal> animals;
    int maxCapacity;
    int currentCapacity;

    public Facility(String facilityType, ArrayList<Animal> animals, int maxCapacity, int currentCapacity) {
        this.facilityType = facilityType;
        this.animals = animals;
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
    }

    public Facility(String facilityType, int maxCapacity) {
        this(facilityType, new ArrayList<>(), maxCapacity, 0);
    }


    public boolean isAvailable() {
        if (currentCapacity < maxCapacity) {
//            System.out.println("The " + facilityType + " facility is available.");
            return true;
        } else {
            System.out.println("The " + facilityType + " facility is NOT available.");
            return false;
        }
    }

    public void scheduleMaintenance(Staff luckyPerson) {
        luckyPerson.assignDuty("Perform maintenance on: " + facilityType);
    }

    public boolean addAnimal(Animal animal) {
        if (isAvailable()) {
            currentCapacity++;
            animals.add(animal);
            return true;
        } else {
            System.out.println(animal + " couldn't be added as there is no room.");
            return false;
        }
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public boolean removeAnimal(Animal animal) {
        if (animals.remove(animal)) {
            currentCapacity--;
            return true;
        } else {
            return false;
        }
    }

    public boolean removeAnimal() {
        if (animals.size() > 0) {
            animals.remove(animals.size() - 1);
            currentCapacity--;
            return true;
        } else {
            return false;
        }
    }

    public void printAnimalsInEnclosure() {
        if (animals.size() == 0) {
            System.out.println("There are currently no animals in this enclosure.");
        } else {
            System.out.println("Current animals in: " + facilityType);
            for (Animal animal : animals) {
                System.out.println(animal);
            }
        }
    }
}
