// maths functions :- max , min , random  functions 

public class Math_Functions {
    public static void main(String[] args) {

        System.out.println(Math.max(10,20));
        System.out.println(Math.min(20,30));

        // In each run random math function will create different random numbers .
        System.out.println(Math.random());
        System.out.println(Math.random());

        // to get a integer number we have to do explict type casting 

        System.out.println((int)(Math.random()));
    }
}
