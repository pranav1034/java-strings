import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter the word to replace:");
        String target = sc.next();

        System.out.println("Enter the replacement word:");
        String replacement = sc.next();

        // Calling the method and printing the modified sentence
        String updatedSentence = replaceWord(sentence, target, replacement);
        System.out.println("Modified Sentence: " + updatedSentence);
    }

    public static String replaceWord(String sentence, String target, String replacement) {
        String[] words = sentence.split(" "); // Split the sentence into words
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // If the word matches the target, replace it, else keep the original word
            if (word.equals(target)) {
                result.append(replacement);
            } else {
                result.append(word);
            }
            result.append(" "); // Add space after each word
        }
        return result.toString().trim(); // Convert StringBuilder to String and remove trailing space
    }
}
