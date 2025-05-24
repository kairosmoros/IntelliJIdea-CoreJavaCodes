package JavaCollections.DateAndTImeAPI;
import java.time.LocalDate;
public class GettingTheCurrentDate {
    public static void main(String[] args) {
        LocalDate currentDate= LocalDate.now();
        System.out.println("Current Date: " +currentDate);
    }
}
