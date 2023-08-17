import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CurrentTimeInGMT {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input the time zone offset to GMT (in hours): ");
            int timeZoneOffset = scanner.nextInt();
            
            if (timeZoneOffset < -12 || timeZoneOffset > 14) {
                System.out.println("Invalid time zone offset. Please provide a valid offset between -12 and 14.");
            } else {
                ZoneOffset offset = ZoneOffset.ofHours(timeZoneOffset);
                ZonedDateTime currentTimeInGMT = ZonedDateTime.now(offset);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                
                System.out.printf("Current time is %s%n", formatter.format(currentTimeInGMT));
            }
        }
    }
}
