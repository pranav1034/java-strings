import java.util.Scanner;

public class DisplayCalendar {
    // Array to store month names
    private static final String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    private static final int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a given month and year
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return daysInMonth[month - 1]; // Return days from array
    }

    // Method to find the first day of the month using Zeller's Congruence formula
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1; // First day of the month
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m) / 12) % 7; // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("\n  " + months[month - 1] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int days = getDaysInMonth(month, year); // Get number of days in the month
        int startDay = getFirstDayOfMonth(month, year); // Get the first day of the month

        // Print spaces before the first day
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print calendar days
        for (int day = 1; day <= days; day++) {
            System.out.printf("%4d", day); // Print day right-aligned in 3 spaces
            if ((day + startDay) % 7 == 0 || day == days) { // Move to next line after Saturday
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for month and year
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Validate input
        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input! Please enter a valid month (1-12) and year.");
        } else {
            displayCalendar(month, year); // Display the calendar
        }       
    }
}
