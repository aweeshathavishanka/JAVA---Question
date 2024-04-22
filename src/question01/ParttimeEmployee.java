package question01;

public class ParttimeEmployee extends Employee {
    private int OTHours;

    public ParttimeEmployee(String name, double salary, int OTHours) {
        super(name, salary);
        this.OTHours = OTHours;
    }

    public void displayEmpInfo() {
        displayInfo(); // Calling the base class method to display name and salary
        System.out.println("OT Hours: " + OTHours);
    }
}
