import java.util.Scanner;

public class WeekdayNameGenerator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input number: ");
            int number = scanner.nextInt();
            
            String weekdayName;
            
            switch (number) {
                case 1:
                    weekdayName = "Monday";
                    break;
                case 2:
                    weekdayName = "Tuesday";
                    break;
                case 3:
                    weekdayName = "Wednesday";
                    break;
                case 4:
                    weekdayName = "Thursday";
                    break;
                case 5:
                    weekdayName = "Friday";
                    break;
                case 6:
                    weekdayName = "Saturday";
                    break;
                case 7:
                    weekdayName = "Sunday";
                    break;
                default:
                    weekdayName = "Invalid input";
            }
            
            System.out.println("Weekday name: " + weekdayName);
        }
    }
}
