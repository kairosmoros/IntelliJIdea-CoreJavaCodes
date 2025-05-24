package JavaCollections.DateAndTImeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingADateToACustomString {
    public static void main(String[] args) {
        LocalDate date= LocalDate.of(2025,5,24);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate=date.format(formatter);
        System.out.println("Formatted Date: " +formattedDate);
    }
}
