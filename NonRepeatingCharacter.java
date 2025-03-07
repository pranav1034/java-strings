import java.util.Scanner;

class NonRepeatingCharacter {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeating(String text) {
        int[] frequency = new int[256]; // Array to store character frequencies

        // Loop through the text to count character frequencies
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++; // Increase count at ASCII index
        }

        // Loop through the text again to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i); // Return first non-repeating character
            }
        }
        return '\0'; // Return null character if no unique character is found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find first non-repeating character
        char result = findFirstNonRepeating(input);

        // Display result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No unique character found.");
        }       
    }
}
