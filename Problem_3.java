// package Assignment;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number (a): ");
        int a = scanner.nextInt();

        // Determine number of terms to generate
        int terms = (a % 2 == 0) ? a - 1 : a;

        System.out.print("Output: ");
        for (int i = 0; i < terms; i++) {
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);

            if (i < terms - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}

