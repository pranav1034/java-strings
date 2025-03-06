import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the first string:");
        String str1 = scanner.next();

        System.out.println("Enter the second string:");
        String str2 = scanner.next();

        // Comparing using custom method
        boolean charAtComparison = compareStrings(str1, str2);

        // Comparing using built-in equals() method
        boolean builtInComparison = str1.equals(str2);

        // Display results
        System.out.println("Comparison using charAt(): " + charAtComparison);
        System.out.println("Comparison using equals(): " + builtInComparison);
 
        if (charAtComparison == builtInComparison) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Mismatch: The methods give different results.");
        }
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Different lengths mean they are not equal
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; 
            }
        }
        return true; // Strings are equal
    }
}
