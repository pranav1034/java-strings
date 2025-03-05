import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean isPalindrome = true;

        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
