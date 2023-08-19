import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input the year: ");
            int year = scanner.nextInt();
            
            boolean isLeapYear = checkLeapYear(year);
            
            if (isLeapYear) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }

    public static boolean checkLeapYear(int year) {
        // A year is a leap year if it's divisible by 4 but not divisible by 100
        // or if it's divisible by 400.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
