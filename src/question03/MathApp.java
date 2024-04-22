package question03;

public class MathApp {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        // Using MathOperations to print a multiplication table
        mathOperations.drawMultiplicationTable(5, 10);  // Example: table of 5 up to 10

        // Using MathOperations to compute and display a factorial
        int result = mathOperations.factorial();
        if (result != -1) {  // Ensuring we do not print invalid results
            System.out.println("Factorial: " + result);
        }
    }
}
