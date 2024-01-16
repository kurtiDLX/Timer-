import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logic {

    private static int hours;
    private static int minutes;

    public static void updateTime(){
        minutes++;
        if(minutes == 60){
            hours++;
            minutes = 0;
        }
        String infoTime = hours + "h " + minutes + "m ";
        updateTime(infoTime);
    }

    private static void updateTime(String timeContent){
        try (
            PrintWriter writer = new PrintWriter(new FileWriter("C:/Users/Mark/Desktop/Portfolio/TimeHours.txt"))){
            writer.println(timeContent);
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
