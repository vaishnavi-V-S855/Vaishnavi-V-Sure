// package Assignment;

import java.util.Scanner;

public class Problem_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Enter the user for the first number
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        // Enter the user for the second number
        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        // user to enter the desired operation
        System.out.print("Enter operation (add / subtract / multiply / divide): ");
        String operation = scanner.next().toLowerCase(); // Convert to lowercase for case-insensitive comparison

        double result;

        // Perform operation based on user input
        switch (operation) {
            case "add":
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case "subtract":
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case "multiply":
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case "divide":
                // Check for division by zero
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = a / b;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                // Handle invalid operation input
                System.out.println("Invalid operation. Please enter one of: add, subtract, multiply, divide.");
        }

        // Close the scanner to free resources
        scanner.close();
    }
}

