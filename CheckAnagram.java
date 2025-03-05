import java.util.HashMap;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Check if the strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Different lengths → not anagrams
        }

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count characters in str1
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Reduce count for characters in str2
        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                return false; // Character not found → not an anagram
            }

            charCountMap.put(c, charCountMap.get(c) - 1);

            // If frequency becomes 0, remove the key
            if (charCountMap.get(c) == 0) {
                charCountMap.remove(c);
            }
        }

        // If map is empty, it's an anagram
        return charCountMap.isEmpty();
    }
}
