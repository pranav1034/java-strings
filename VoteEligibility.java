import java.util.Random;
import java.util.Scanner;

public class VoteEligibility {

    // Method to generate random ages for students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        //Random rand = new Random();

        for (int i = 0; i < n; i++) {
            ages[i] = 10+ (int)(Math.random()*90) ; // Random age between -10 and 80
        }

        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("Student Age\tVoting Eligibility");

        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate random ages
        int[] studentAges = generateAges(n);

        // Check voting eligibility
        String[][] eligibilityTable = checkVotingEligibility(studentAges);

        // Display results in a table
        displayTable(eligibilityTable);

    }
}
