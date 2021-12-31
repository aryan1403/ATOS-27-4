import java.time.LocalDate;
import java.time.LocalTime;

public class datetime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("Date : " + date);
        System.out.println("Time : " + time.getHour() + "hours " + time.getMinute() + "mins " + time.getSecond() + "s.");
    }
}
