import java.util.Scanner;

public class CreateSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the string:");
        String str = scanner.next();

        System.out.println("Enter the start index:");
        int start = scanner.nextInt();

        System.out.println("Enter the end index:");
        int end = scanner.nextInt();

        // Creating substring using charAt() method
        String charAtSubstring = createSubstring(str, start, end);

        // Creating substring using built-in substring() method
        String builtInSubstring = str.substring(start, end);

        // Comparing both substrings
        boolean isSame = compareStrings(charAtSubstring, builtInSubstring);

        // Displaying results
        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + isSame);

    }

    // Method to create substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

