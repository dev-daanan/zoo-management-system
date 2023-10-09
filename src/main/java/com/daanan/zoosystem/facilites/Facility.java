package src.main.java.com.daanan.zoosystem.facilites;

import src.main.java.com.daanan.zoosystem.staff.Staff;

public abstract class Facility {
    String facilityType; //  (such as 'Enclosure', 'Cafeteria', 'Restroom', etc.)
    int maxCapacity;
    boolean isAvailable(int animalsToAdd) {
        if(animalsToAdd < maxCapacity - animalsToAdd) {
            System.out.println("The "+ facilityType +" facility is available.");
            return true;
        } else {
            System.out.println("The "+ facilityType +" facility is NOT available.");
            return false;
        }
    }
    void scheduleMaintenance(Staff luckyPerson) {
        luckyPerson.assignDuty("Perform maintenance on: " + facilityType);
    }
}
