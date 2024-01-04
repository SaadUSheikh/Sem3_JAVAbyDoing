import javax.swing.*;
import java.awt.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class GraphicalDigitalClock {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Digital Clock");
            JLabel timeLabel = new JLabel();
            timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
            frame.add(timeLabel);
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

            // Update the clock every second
            Timer timer = new Timer(1000, e -> updateTime(timeLabel, "Australia/Melbourne")); // Change the time zone as needed
            timer.start();
        });
    }

    private static void updateTime(JLabel label, String timeZone) {
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of(timeZone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        label.setText(now.format(formatter));
    }
}