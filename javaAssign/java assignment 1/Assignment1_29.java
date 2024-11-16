

import java.util.HashMap;
import java.util.Scanner;
public class Assignment1_29 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt(); 

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        findDuplicatesAndFrequency(numbers);

        scanner.close();
    }

    public static void findDuplicatesAndFrequency(int[] numbers) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements and their frequencies:");
        boolean foundDuplicate = false;
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > 1) {
                System.out.println("Element: " + key + " Frequency: " + frequencyMap.get(key));
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate elements found.");
        }
    }
}


