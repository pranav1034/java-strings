import java.util.Scanner;

class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store character frequencies

        // Loop through the text to count character occurrences
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Store characters and their frequencies in a 2D array
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Store character
                result[index][1] = String.valueOf(frequency[i]); // Store frequency
                index++;
            }
        }
        return result;
    }
    // Method to display the frequency table
    public static void displayCharacterFrequency(String[][] frequencyData) {
        System.out.println("\nCharacter Frequency Table:");
        System.out.println("Character\tFrequency");
        for (String[] row : frequencyData) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find character frequency
        String[][] frequencyTable = findCharacterFrequency(input);

        // Display results
        displayCharacterFrequency(frequencyTable);       
    }
}
