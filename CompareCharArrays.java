import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the string:");
        String str = scanner.nextLine();

        // Getting characters using custom method
        char[] customCharArray = getCharacters(str);

        // Getting characters using built-in toCharArray() method
        char[] builtInCharArray = str.toCharArray();

        // Comparing both character arrays
        boolean isSame = compareCharArrays(customCharArray, builtInCharArray);

        // Displaying results
        System.out.println("Characters using custom method: " + String.valueOf(customCharArray));
        System.out.println("Characters using toCharArray(): " + String.valueOf(builtInCharArray));
        System.out.println("Are both character arrays equal? " + isSame);

    }

    // Method to return all characters in a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] charArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        return charArray;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
