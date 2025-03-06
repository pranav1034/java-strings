import java.util.Scanner;

public class ArrayIndexExc {

    // Method to generate ArrayIndexOutOfBoundsException
    static void generateException(String[] names, int index) {
        System.out.println("Attempting to access an invalid index...");
        System.out.println("Name at index " + index + ": " + names[index]); // This will throw ArrayIndexOutOfBoundsException
    }

    // Method to handle ArrayIndexOutOfBoundsException
    static void handleException(String[] names, int index) {
        try {
            System.out.println("Attempting to access an invalid index...");
            System.out.println("Name at index " + index + ": " + names[index]); // May throw exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Take user input for index
        System.out.print("Enter an index to access (0-4 for valid values): ");
        int index = sc.nextInt();

        // Uncomment below to see the exception occur
        // generateException(names, index); 

        // Properly handling the exception
        handleException(names, index);       
    }
}
