package question05;

public class StudentApp {
    public static void main(String[] args) {
        // Create the first Course object and display its information
        Course course1 = new Course("Alice", 20, "Java Programming");
        System.out.println("Details for the first course:");
        course1.displayCourseInfo();

        // Create the second Course object and display its information
        Course course2 = new Course("Bob", 22, "Data Structures");
        System.out.println("\nDetails for the second course:");
        course2.displayCourseInfo();
    }
}
