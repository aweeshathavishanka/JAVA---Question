package question05;

public class Course extends Student {
    private String courseName;

    // Overloaded constructor
    public Course(String name, int age, String courseName) {
        super(name, age);  // Call the constructor of the base class (Student)
        this.courseName = courseName;
    }

    // Method to display course information including student details
    public void displayCourseInfo() {
        super.displayInfo();  // Display the student info
        System.out.println("Course Name: " + courseName);
    }
}
