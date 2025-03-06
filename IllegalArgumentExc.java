import java.util.Scanner;

public class IllegalArgumentExc {

    // Method to generate IllegalArgumentException
    static void generateException(String text) {
        System.out.println("Attempting to use substring with invalid indices...");
        System.out.println(text.substring(5, 2)); // Start index > End index, causes IllegalArgumentException
    }

    // Method to handle IllegalArgumentException
    static void handleException(String text) {
        try {
            System.out.println("Attempting to use substring with invalid indices...");
            System.out.println(text.substring(5, 2)); // Start index > End index
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } //catch (RuntimeException e) {
          //  System.out.println("Caught RuntimeException: " + e);
        //}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Uncomment below to see the exception occur
        // generateException(userInput); 

        // Properly handling the exception
        handleException(userInput);      
    }
}
