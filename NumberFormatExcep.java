import java.util.Scanner;

public class NumberFormatExcep {

    // Method to generate NumberFormatException
    static void generateException(String text) {
        System.out.println("Attempting to convert text to number...");
        int number = Integer.parseInt(text); // This will throw NumberFormatException if text is not a valid integer
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException
    static void handleException(String text) {
        try {
            System.out.println("Attempting to convert text to number...");
            int number = Integer.parseInt(text); // May throw NumberFormatException
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        String userInput = sc.nextLine();

        // Uncomment below to see the exception occur
        // generateException(userInput); 

        // Properly handling the exception
        handleException(userInput);        
    }
}
