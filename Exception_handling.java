// Exception handling occurs in try block an d caught in the catch block. so error will not an dthe code run as usual and print , run other statement .

public class Exception_handling {
    public static void main(String[] args) {
        
            // Try-catch at exception handling 
        int [] marks={97 , 98 , 95};

        try {
            System.out.println(marks[5]);
        } catch (Exception e) {
            //do something after catching 
        } 
        
        System.out.println("The name is Subhankar Sahoo");
    }
}
