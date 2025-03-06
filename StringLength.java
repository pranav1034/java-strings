import java.util.Scanner;

public class StringLength{

    // Method to find string length without using length() method
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) { // Infinite loop until exception occurs
                s.charAt(count); // Try accessing character at index count
                count++; // Increment count if no exception
            }
        } catch (IndexOutOfBoundsException e) {
            return count; // Return count when exception occurs
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); 

        // Finding length using custom method
        int customLength = findLength(str);

        // Finding length using built-in method
        int builtInLength = str.length();

        // Display results
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in method: " + builtInLength);    
    }
}
