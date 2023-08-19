import java.util.Scanner;

public class DaysInMonthCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a month number: ");
            int month = scanner.nextInt();
            
            System.out.print("Input a year: ");
            int year = scanner.nextInt();
            
            int daysInMonth = getDaysInMonth(month, year);
            
            String monthName = getMonthName(month);
            
            System.out.printf("%s %d has %d days%n", monthName, year, daysInMonth);
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month number");
        }

        int daysInMonth;

        switch (month) {
            case 2:
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    daysInMonth = 29; // Leap year
                } else {
                    daysInMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
        }

        return daysInMonth;
    }

    public static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month number");
        }

        return monthNames[month - 1];
    }
}
