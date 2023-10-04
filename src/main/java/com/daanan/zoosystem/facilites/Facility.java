package src.main.java.com.daanan.zoosystem.facilites;

import src.main.java.com.daanan.zoosystem.staff.Staff;

public abstract class Facility {
    String type; //  (such as 'Enclosure', 'Cafeteria', 'Restroom', etc.)
    int capacity;
    boolean isAvailable(int capacityNeeded) {
        if(capacityNeeded < capacity - capacityNeeded) {
            System.out.println("The "+ type +" facility is available.");
            return true;
        } else {
            System.out.println("The "+ type +" facility is NOT available.");
            return false;
        }
    }
    abstract void scheduleMaintenance(Staff luckyPerson);
}
