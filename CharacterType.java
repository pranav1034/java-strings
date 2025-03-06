import java.util.Scanner;

public class CharacterType{

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert uppercase letters to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase
        }

        // Check if it is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if it is a consonant
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        return "Not a Letter"; // If not a letter
    }

    // Method to store character types in a 2D array
    public static String[][] classifyCharacters(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayCharacterTypes(String[][] data) {
        System.out.println("Character\tType");

        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Get character classifications
        String[][] charTypes = classifyCharacters(input);

        // Display results
        displayCharacterTypes(charTypes);
    }
}
