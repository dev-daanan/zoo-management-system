package src.main.java.com.daanan.zoosystem.staff;

import java.util.ArrayList;

public class Staff {
    String name;
    String position;
    String shift;
    ArrayList<String> duties;

    public Staff(String name) {
        this.name = name;
        this.position = "";
        this.shift = "";
        this.duties = new ArrayList<>();
    }

    // Assign staff to particular shifts
    public void assignShift(String shift) {
        shift = shift.toLowerCase();
        if ("day".equals(shift)) {
            this.shift = shift;
        } else if ("night".equals(shift)) {
            this.shift = shift;
        } else {
            System.out.println("Invalid Assignment.\n" +
                    "There are only two shifts available: Day or Night");
        }
    }

    // Assign specific duties/tasks to staff members
    public void assignDuty(String task) {
        System.out.println(name + " was assigned to perform task(s): " + task);
        duties.add(task);
    }

    public void work() {
        System.out.println(name + " has performed task(s): " + duties.get(duties.size() - 1));
        duties.remove(duties.size() - 1);
    }


}
