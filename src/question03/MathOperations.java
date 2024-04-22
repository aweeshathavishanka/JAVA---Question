package question03;

import java.util.Scanner;

public class MathOperations {

    // Method to draw a multiplication table for a given number up to a specified range
    public void drawMultiplicationTable(int number, int range) {
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= range; i++) {
            System.out.printf("%d * %d = %d%n", number, i, number * i);
        }
    }

    // Method to calculate the factorial of a number provided by the user
    public int factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer to calculate its factorial: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1; // Returning -1 as an error code for negative input
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
