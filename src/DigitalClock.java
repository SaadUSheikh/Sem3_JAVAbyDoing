import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DigitalClock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time zone or country (e.g., 'Europe/Paris', 'America/New_York'):");
        String timeZone = scanner.nextLine();

        try {
            ZoneId zoneId = ZoneId.of(timeZone);
            ZonedDateTime now = ZonedDateTime.now(zoneId);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = now.format(formatter);
            System.out.println("Current time in " + timeZone + ": " + formattedTime);
        } catch (Exception e) {
            System.out.println("Invalid time zone or country.");
        }
    }

}