import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Logic.updateTime();
            }
        };
        timer.schedule(task, 0, 60 * 1000);
    }
}