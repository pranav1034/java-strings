import java.util.Scanner;

public class ShortestAndLongest {

    // Method to find the length of a string without using length()
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count; // Return count when exception occurs
        }
    }

    // Method to split text into words manually
    public static String[] splitText(String s) {
        int length = findLength(s);
        int spaceCount = 0;

        // Count spaces to determine number of words
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

    // Method to generate a 2D array with words and their lengths
    public static String[][] generateWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Store the word
            result[i][1] = String.valueOf(findLength(words[i])); // Store the length as String
        }

        return result;
    }

    // Method to find shortest and longest words
    public static int[] findShortestLongest(String[][] wordArray) {
        int minLength = Integer.MAX_VALUE, maxLength = Integer.MIN_VALUE;
        int shortestIndex = 0, longestIndex = 0;

        for (int i = 0; i < wordArray.length; i++) {
            int wordLength = Integer.parseInt(wordArray[i][1]);

            if (wordLength < minLength) {
                minLength = wordLength;
                shortestIndex = i;
            }
            if (wordLength > maxLength) {
                maxLength = wordLength;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        // Split words manually
        String[] words = splitText(str);

        // Generate 2D array with word lengths
        String[][] wordLengthArray = generateWordLengthArray(words);

        // Find shortest and longest words
        int[] indices = findShortestLongest(wordLengthArray);

        // Display results
        System.out.println("Word\tLength");
        for (String[] row : wordLengthArray) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1])); // Convert String to Integer for display
        }

        System.out.println("Shortest word: " + wordLengthArray[indices[0]][0]);
        System.out.println("Longest word: " + wordLengthArray[indices[1]][0]);
    }
}
