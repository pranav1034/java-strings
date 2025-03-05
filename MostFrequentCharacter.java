import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
        char mostFrequentChar = findMostFrequentChar(str);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }

    // Method to find the most frequent character using HashMap
    public static char findMostFrequentChar(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Step 1: Count occurrences of each character
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Step 2: Find the character with the maximum count
        char maxChar = 's';
        int maxCount = 0;

        for (char key : charCountMap.keySet()) {
            int count = charCountMap.get(key);
            if (count > maxCount) {
                maxCount = count;
                maxChar = key;
            }
        }

        return maxChar;
    }
}

