import java.util.Scanner;

public class SplitIntoWords {

    // Method to find the length of a string without using length()
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words manually
    public static String[] splitText(String s) {
        int length = findLength(s); // Get the length manually
        int spaceCount = 0;

        // Count spaces to determine the number of words
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount + 1]; // Store space indexes
        int index = 0;

        // Store space indexes
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Array to store words
        String[] words = new String[spaceCount + 1];
        int start = 0;

        for (int i = 0; i < spaceCount; i++) {
            words[i] = s.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[spaceCount] = s.substring(start); // Last word

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        // Split using manual method
        String[] manualSplit = splitText(str);

        // Split using built-in split()
        String[] builtInSplit = str.split(" ");

        // Compare results
        boolean isSame = compareArrays(manualSplit, builtInSplit);

        // Display results
        System.out.println("Words after manual split: ");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("Words after built-in split: ");
        for (String word : builtInSplit) {
            System.out.println(word);
        }
        System.out.println("Are both results the same? " + isSame);
    }
}
