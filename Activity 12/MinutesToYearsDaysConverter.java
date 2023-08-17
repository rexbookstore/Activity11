import java.util.Scanner;

public class MinutesToYearsDaysConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input the number of minutes: ");
            long minutes = scanner.nextLong();
            
            if (minutes < 0) {
                System.out.println("Please enter a positive number of minutes.");
            } else {
                long minutesInYear = 365 * 24 * 60;
                long years = minutes / minutesInYear;
                long remainingMinutes = minutes % minutesInYear;
                long days = remainingMinutes / (24 * 60);
                
                System.out.printf("%d minutes is approximately %d years and %d days%n", minutes, years, days);
            }
        }
    }
}
