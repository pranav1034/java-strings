import java.util.Scanner;

class CalculateBmi {

    // Method to compute BMI and return status
    public static String[][] computeBMI(double[][] data) {
        int persons = data.length;
        String[][] bmiResults = new String[persons][4]; // Height, Weight, BMI, Status

        for (int i = 0; i < persons; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; // Convert cm to meters

            double bmi = weight / (heightInMeters * heightInMeters); // BMI formula
            bmi = Math.round(bmi * 100.0) / 100.0; // Round to 2 decimal places

            // Determine BMI Status
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal";
            } else if (bmi < 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store results
            bmiResults[i][0] = String.valueOf(data[i][0]); // Weight
            bmiResults[i][1] = String.valueOf(data[i][1]); // Height
            bmiResults[i][2] = String.valueOf(bmi); // BMI
            bmiResults[i][3] = status; // Status
        }
        return bmiResults;
    }

    // Method to display BMI results in tabular format
    public static void displayResults(String[][] bmiData) {
        System.out.println("\nBMI Report:");
        System.out.println("Person  Weight(kg)  Height(cm)  BMI    Status");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%-7d %-10s %-10s %-6s %s\n",
                    (i + 1), bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiData[i][3]);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = 10; // Number of team members
        double[][] personData = new double[persons][2]; // 2D array for weight & height

        // Taking user input
        for (int i = 0; i < persons; i++) {
            System.out.print("Enter weight (kg) for Person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for Person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
        }

        // Compute BMI and status
        String[][] bmiResults = computeBMI(personData);

        // Display final results
        displayResults(bmiResults);
    }
}
