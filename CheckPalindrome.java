import java.util.Scanner;

public class CheckPalindrome{

    // Logic 1: Check palindrome using two-pointer method (start & end comparison)
    public static boolean isPalindromeTwoPointer(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Check palindrome using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; // Base case: Reached middle of the string
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false; // Characters do not match
        }
        return isPalindromeRecursive(text, start + 1, end - 1); // Recursion step
    }

    // Logic 3: Check palindrome by reversing a string using charAt()
    public static boolean isPalindromeReverseArray(String text) {
        int length = text.length();
        char[] reversed = new char[length];

        // Create a reversed version of the string
        for (int i = 0; i < length; i++) {
            reversed[length - 1 - i] = text.charAt(i);
        }
        // Convert reversed array back to string and compare
        return text.equals(new String(reversed));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase to ensure case-insensitive comparison
        input = input.toLowerCase();

        // Apply all three palindrome checks
        boolean result1 = isPalindromeTwoPointer(input);
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean result3 = isPalindromeReverseArray(input);

        // Display results
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Using Two-Pointer Method: " + result1);
        System.out.println("Using Recursion: " + result2);
        System.out.println("Using Reverse Array: " + result3);       
    }
}
