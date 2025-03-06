import java.util.Scanner;

public class NullPointerException {

    // Method that generates NullPointerException
    static void generateException() {
        String text = null; // Variable initialized to null
        System.out.println(text.length()); // This will throw NullPointerException
    }

    // Method that handles NullPointerException
    static void handleException() {
        String text = null; // Variable initialized to null
        try {
            System.out.println(text.length()); // Attempting to access a method on null
        } catch (Exception e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        // here you will get error while running code below handleException will run
        // easily.
        // generateException();

        // Properly handling the exception
        handleException();

    }
}
