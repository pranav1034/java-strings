import java.util.Scanner;

public class ToLowerCase {

    // Method to convert uppercase letters to lowercase manually
    public static String intoLowerCase(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ans += (char) (s.charAt(i) + 32); // Convert uppercase to lowercase
            } else {
                ans += s.charAt(i); // Keep lowercase and other characters unchanged
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        // Convert manually using the defined method
        System.out.println("After converting into lowercase manually: ");
        String ans = intoLowerCase(str);
        System.out.println(ans);

        // Convert using built-in method
        System.out.println("After converting into lowercase using inbuilt method: ");
        String ans1 = str.toLowerCase();
        System.out.println(ans1);

        // Comparing both results
        System.out.println("Comparing both conversions: " + ans.equals(ans1));       
    }
}
