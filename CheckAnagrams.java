import java.util.Scanner;

public class CheckAnagrams {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Step 1: Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency1 = new int[256]; // ASCII character frequency for text1
        int[] frequency2 = new int[256]; // ASCII character frequency for text2

        // Step 2: Count character frequency for both texts
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Step 3: Compare character frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine().toLowerCase(); // Convert to lowercase for case insensitivity

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine().toLowerCase();
        // Check if they are anagrams
        boolean result = areAnagrams(text1.replaceAll("\\s", ""), text2.replaceAll("\\s", "")); // Remove spaces

        // Display result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
    }
}
