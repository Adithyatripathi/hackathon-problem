import java.util.Timer;
import java.util.TimerTask;

public class WaterReminder {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask waterTask = new TimerTask() {
            @Override
            public void run() {
                // Task to remind to drink water
                System.out.println("Reminder: Drink water now!");
            }
        };

        // Scheduling the reminder to occur every 2 hours
        long twoHoursInMillis = 2 * 60 * 60 * 1000; // 2 hours in milliseconds
        timer.schedule(waterTask, 0, twoHoursInMillis);
    }
}
