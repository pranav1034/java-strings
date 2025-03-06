import java.util.Scanner;

public class TrimSpaces {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndices(String s) {
        int start = 0, end = s.length() - 1;

        // Find first non-space character
        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }

        // Find last non-space character
        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end}; // Return start and end indices
    }

    // Method to create a substring using charAt()
    public static String customSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        // Get trim indices
        int[] indices = findTrimIndices(input);

        // Trim manually
        String trimmedManual = customSubstring(input, indices[0], indices[1]);

        // Trim using built-in method
        String trimmedBuiltIn = input.trim();

        // Compare results
        boolean isSame = compareStrings(trimmedManual, trimmedBuiltIn);

        // Display results
        System.out.println("Manually Trimmed: " + trimmedManual);
        System.out.println("Built-in Trimmed: " + trimmedBuiltIn);
        System.out.println("Are both results the same? " + isSame);
    }
}
