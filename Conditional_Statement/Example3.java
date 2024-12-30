
import java.util.Scanner;

//There are two objects copy and pen whose price is 40 & 10
// WAP taking input from user to see whether:-
//      can buy both , can't buy anything can buy 1 thing 

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount:");
        int cash = sc.nextInt();

        if(cash>40)
        System.out.println("Can buy both");
        else if(cash>10 &&cash<40)
        System.out.println("Can buy 1 thing ");
        else 
        System.out.println("Can't buy anything");

    }
    
}
