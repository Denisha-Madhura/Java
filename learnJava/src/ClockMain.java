import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ClockMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "src\\Apollo - Telecasted.wav";

    while(alarmTime == null) {
        try {
            System.out.print("Enter an alarm time(HH:mm:ss): ");
            String inputTime = scanner.nextLine();
            alarmTime = LocalTime.parse(inputTime, formatter);
            System.out.println("Alarm set for " + alarmTime);

        } catch (DateTimeException e) {
            System.out.println("Invalid format. please use HH:mm:ss");
        }
    }

    alarmClock ac = new alarmClock(alarmTime, filePath, scanner);
    Thread alarmThread = new Thread(ac);
    alarmThread.start();

    }
}
