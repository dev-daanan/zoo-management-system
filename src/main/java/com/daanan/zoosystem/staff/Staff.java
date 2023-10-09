package src.main.java.com.daanan.zoosystem.staff;

import java.util.ArrayList;

public class Staff {
    String name;
    String position;
    String shift;
    ArrayList<String> duties;

    public Staff(String name, String position, String shift, ArrayList<String> duties) {
        this.name = name;
        this.position = position;
        this.shift = shift;
        this.duties = duties;
    }

    public Staff(String name) {
        this(name, "General Labourer", "TBD", new ArrayList<>());
    }

    /**
     * Assign staff to particular shifts
     * Options: day, night
     */
    public void assignShift(String shift) {
        shift = shift.toLowerCase();
        if ("day".equals(shift)) {
            this.shift = shift;
            System.out.println(name + "has been assigned to day shift.");
        } else if ("night".equals(shift)) {
            this.shift = shift;
            System.out.println(name + " has been assigned to night shift.");
        } else {
            System.out.println("Invalid Assignment.\n" +
                    "There are only two shifts available: Day or Night");
        }
    }

    // Assign specific duties/tasks to staff members
    public void assignDuty(String task) {
        System.out.println(name + " was assigned to task: \"" + task + "\"");
        duties.add(task);
    }

    public void work() {
        System.out.println(name + " has performed task: " + duties.get(duties.size() - 1));
        duties.remove(duties.size() - 1);
    }

    public void work(int index) {
        index--;
        System.out.println(name + " has performed task: " + duties.get(index));
        duties.remove(index);
    }

    public void printDuties() {
        int index = 1;
        System.out.println("-".repeat(50));
        System.out.println(name + "'s duties are listed below:");
        for (String duty : duties) {
            System.out.println(index + ": " + duty);
            index++;
        }
        System.out.println("-".repeat(50));
    }

    public void printDetails() {
        System.out.println(
                "Details on: " + name +
                        "\nposition: " + position +
                        "\nshift: " + shift

        );
        printDuties();

    }


}
