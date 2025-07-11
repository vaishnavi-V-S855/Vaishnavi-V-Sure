// package Assignment;

import java.util.*;

public class Problem_4 {

    public static void main(String[] args) {
        
        // Input list of numbers to be checked for multiples
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Map to store the count of multiples for numbers 1 through 9
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        // Initialize map with keys from 1 to 9 and values as 0
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Loop through numbers 1 to 9 and count how many elements in the list are divisible by them
        for (int divisor = 1; divisor <= 9; divisor++) {
            int count = 0;
            for (int number : numbers) {
                if (number % divisor == 0) {
                    count++;
                }
            }
            // Update the map with the count of numbers divisible by current divisor
            countMap.put(divisor, count);
        }

        // Print the final result
        System.out.println("Output:");
        System.out.println(countMap);
    }
}
