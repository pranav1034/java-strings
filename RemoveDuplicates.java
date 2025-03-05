import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
	System.out.println("The given string is: "+str);
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }
        System.out.println("Modified String: " + result.toString());
    }
}
