import java.util.Scanner;

public class onedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the size of the array as input
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Creating the array
        int[] numbers = new int[size];

        // Filling the array with user input
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Taking the number to search for
        System.out.print("Enter the number to search for: ");
        int x = sc.nextInt();

        // Searching for the number in the array
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == x) {
                System.out.println("X is found at index: " + i);
                found = true;
                break; // Exit the loop once the number is found
            }
        }

        // If the number is not found
        if (!found) {
            System.out.println("X is not found in the array.");
        }

        // Closing the scanner
        sc.close();
    }
}
