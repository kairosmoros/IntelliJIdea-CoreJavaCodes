package JavaCollections.DateAndTImeAPI;

import java.time.LocalDate;

public class ParsingADateFromAString {
    public static void main(String[] args) {
        String dateString="2025-05-23";//this is default format of date
        LocalDate date= LocalDate.parse(dateString);
        System.out.println("Parsed Date: " +date);
    }
}
