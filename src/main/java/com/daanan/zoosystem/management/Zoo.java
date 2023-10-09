package src.main.java.com.daanan.zoosystem.management;

import src.main.java.com.daanan.zoosystem.animals.Animal;
import src.main.java.com.daanan.zoosystem.facilites.Facility;
import src.main.java.com.daanan.zoosystem.staff.Staff;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList<Animal> allAnimals;
    private ArrayList<Staff> allStaff;
    private ArrayList<Facility> allFacilities;

    public Zoo(String name, ArrayList<Animal> allAnimals, ArrayList<Staff> allStaff, ArrayList<Facility> allFacilities) {
        this.name = name;
        this.allAnimals = allAnimals;
        this.allStaff = allStaff;
        this.allFacilities = allFacilities;
    }

    public Zoo(String name) {
        this.name = name;
        this.allAnimals = new ArrayList<>();
        this.allStaff = new ArrayList<>();
        this.allFacilities = new ArrayList<>();
    }

    public boolean addAnimal(Animal animal, Facility facility) {
        return facility.addAnimal(animal);
    }
    public boolean removeAnimal(Animal animal, Facility facility) {
        return facility.removeAnimal(animal);
    }
    public boolean removeAnimal(Facility facility) {
        return facility.removeAnimal();
    }

    public void scheduleMaintenance(Facility facility, Staff staff) {
        facility.scheduleMaintenance(staff);
    }

    public void printAllAnimalsAtZoo() {
        for (Facility facility : allFacilities) {
            System.out.println("Facility Type: " + facility.getFacilityType());
            facility.printAnimalsInEnclosure();
        }
    }

    public void addFacility(Facility facility) {
        allFacilities.add(facility);
    }

    public boolean hireStaff(String name) {
        Staff newStaff = new Staff(name);
        return allStaff.add(newStaff);
    }
}
