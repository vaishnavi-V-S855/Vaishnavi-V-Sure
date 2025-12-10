// package Assignment;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// user to enter a number (the count of odd numbers to be generated)
		System.out.print("Enter a number (a): ");
		int a = scanner.nextInt();

		System.out.print("Output: ");

		// Loop 'a' times to print the first 'a' odd numbers
		for (int i = 0; i < a; i++) {
			// Formula to generate odd numbers: 2 * i + 1
			int oddNumber = 2 * i + 1;

			// Print the current odd number
			System.out.print(oddNumber);

			// Print comma after each number except the last one
			if (i < a - 1) {
				System.out.print(", ");
			}
		}

		// Close the scanner to avoid resource leak
		scanner.close();
	}
}

