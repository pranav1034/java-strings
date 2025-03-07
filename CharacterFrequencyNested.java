import java.util.Scanner;

class CharacterFrequencyNested {

    // Method to find character frequencies using nested loops
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray(); // Convert string to character array
        int length = characters.length;
        int[] frequency = new int[length]; // Array to store frequency

        // Outer loop to iterate through each character
        for (int i = 0; i < length; i++) {
            if (characters[i] == '0') { // Skip already counted characters
                continue;
            }

            frequency[i] = 1; // Initialize frequency to 1

            // Inner loop to check for duplicates
            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++; // Increment frequency count
                    characters[j] = '0'; // Mark duplicate as counted
                }
            }
        }
        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        // Store character and frequency in a 1D array
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                result[index++] = characters[i] + " - " + frequency[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find character frequency
        String[] frequencyData = findCharacterFrequency(input);

        // Display results
        System.out.println("\nCharacter Frequency:");
        for (String entry : frequencyData) {
            System.out.println(entry);
        }       
    }
}
