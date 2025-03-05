public class CompareTwoStrings {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        int result = compareStrings(str1, str2);

        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
        }
    }

    // Method to compare two strings without using compareTo()
    public static int compareStrings(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = Math.min(len1, len2); // Get the length of the smaller string

        // Compare each character
        for (int i = 0; i < minLen; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                return c1 - c2; // Return the ASCII difference
            }
        }

        // If all compared characters are the same, compare lengths
        return len1 - len2;
    }
}
