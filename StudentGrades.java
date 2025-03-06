import java.util.Random;
import java.util.Scanner;

class ScoreCard {

    // Method to generate random PCM scores for students
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3]; // 3 subjects: Physics, Chemistry, Maths
        Random rand = new Random();

        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(61) + 40; // Physics (Random between 60-100)
            scores[i][1] = rand.nextInt(61) + 40; // Chemistry (Random between 60-100)
            scores[i][2] = rand.nextInt(61) + 40; // Maths (Random between 60-100)
        }

        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateStats(int[][] scores) {
        int students = scores.length;
        double[][] stats = new double[students][3]; // Total, Average, Percentage

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return stats;
    }

    // Method to determine grade and remarks
    public static String[][] calculateGrades(double[][] stats) {
        int students = stats.length;
        String[][] grades = new String[students][2]; // Grade & Remarks

        for (int i = 0; i < students; i++) {
            double percentage = stats[i][2];

            if (percentage >= 80) {
                grades[i][0] = "A";
                grades[i][1] = "Level-4, above agency-normalized standards";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
                grades[i][1] = "Level-3, at agency-normalized standards";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
                grades[i][1] = "Level-2, below but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
                grades[i][1] = "Level-1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
                grades[i][1] = "Level-1, Too below agency-normalized standards";
            } else {
                grades[i][0] = "F";
                grades[i][1] = "Remedial standards";
            }
        }

        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] stats, String[][] grades) {
        System.out.println("Student Scorecard:");

        System.out.println("ID  Physics  Chemistry  Maths  Total  Average  Percentage  Grade  Remarks");


        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-3d %-8d %-9d %-6d %-6.0f %-8.2f %-10.2f %-5s %s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2],
                    grades[i][0], grades[i][1]);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of students
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // Generate random scores
        int[][] scores = generateScores(students);

        // Calculate total, average, and percentage
        double[][] stats = calculateStats(scores);

        // Determine grades and remarks
        String[][] grades = calculateGrades(stats);

        // Display the final scorecard
        displayScorecard(scores, stats, grades);       
    }
}
