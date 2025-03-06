import java.util.Scanner;

public class ToUpperCase {
    public static String intoUpperCase(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97) {
                ans += (char) (s.charAt(i) - 32);
            } else {
                ans += s.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        // method calling intoUpperCase(str)
        System.out.println("After converting into uppercase: ");
        String ans = intoUpperCase(str);
        System.out.println(ans);

        System.out.println("After converting into uppercase using inbuilt method: ");
        String ans1 = str.toUpperCase();
        System.out.println(ans1);

        // comparing results
        System.out.println("ans and ans1 is " + ans.equals(ans1));
    }
}
