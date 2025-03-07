import java.util.Scanner;

class UniqueCharacters {
    // Method to find the length of the text without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Try accessing each character
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count; // Return count when exception occurs
        }
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length]; // Array to store unique characters
        int uniqueCount = 0; // Counter for unique characters

        // Loop to find unique characters
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if character already exists in uniqueChars array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            // If character is unique, store it
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }
        // Create a new array to store only the unique characters found
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(input);

        // Display results
        System.out.print("Unique characters: ");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " ");
        }       
    }
}
