import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static String removeCharacter(String str, char removeChar) {
        return str.replaceAll(Character.toString(removeChar), "");
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char removeChar = sc.next().charAt(0);
        System.out.println("Modified String: " + removeCharacter(str, removeChar));
    }
}
