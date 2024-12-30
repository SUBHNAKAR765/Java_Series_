//example 1

import java.util.Scanner;

public class Conditional_Statement {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the age :");
    int age = scanner.nextInt();

    if (age >18)
        System.out.println("Can vote");
    else 
        System.out.println("Cannot vote");
}
    
}