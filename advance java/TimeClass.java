import java.time.LocalDate;
import java.time.LocalTime;

public class TimeClass {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        
        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow);

        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}
