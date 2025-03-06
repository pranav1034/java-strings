
import java.util.Scanner;

public class StringIndexException {

    // Method to generate StringIndexOutOfBoundsException
    static void generateException(String text) {
        System.out.println("Attempting to access index out of bounds...");
        System.out.println(text.charAt(text.length())); // Accessing invalid index
    }

    // Method to handle StringIndexOutOfBoundsException
    static void handleException(String text) {
        try {
            System.out.println("Attempting to access index out of bounds...");
            System.out.println(text.charAt(text.length())); // Accessing invalid index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
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
