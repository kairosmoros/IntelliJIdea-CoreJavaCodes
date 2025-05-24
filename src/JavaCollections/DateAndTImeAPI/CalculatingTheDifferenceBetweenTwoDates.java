package JavaCollections.DateAndTImeAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculatingTheDifferenceBetweenTwoDates {
    public static void main(String[] args) {
        LocalDate date1= LocalDate.of(2025,5,24);
        LocalDate date2=LocalDate.of(2026,6,7);
        long daysDifference= ChronoUnit.DAYS.between(date1,date2);
        System.out.println("Days Difference: " +daysDifference);
    }
}
