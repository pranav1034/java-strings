import java.util.Scanner;

class UniqueCharacterFrequency {
    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length]; // Array to store unique characters
        int uniqueCount = 0;

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

    // Method to find the frequency of unique characters
    public static String[][] findCharacterFrequency(String text) {
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] frequencyTable = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char uniqueChar = uniqueChars[i];
            int count = 0;

            // Loop to count occurrences of the unique character
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == uniqueChar) {
                    count++;
                }
            }

            // Store character and its frequency
            frequencyTable[i][0] = String.valueOf(uniqueChar);
            frequencyTable[i][1] = String.valueOf(count);
        }
        return frequencyTable;
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
