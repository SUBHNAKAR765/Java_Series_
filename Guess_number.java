import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.* ;
public class Guess_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;
        do {
            System.out.println("GUESS MY NUMBER :");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WOOHOO......CORRECT  NUMBER !!!!!! ");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("YOUR NUMBER IS TOO LARGE ");
            } else {
                System.out.println("YOUR NUMBER IS SMALL ");
            }
        } while (userNumber >= 0);
        System.out.println("MY NUMBER WAS");
        System.out.println(myNumber);
    }
}

