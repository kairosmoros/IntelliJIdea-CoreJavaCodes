package JavaCollections.DateAndTImeAPI;

import java.time.Year;

public class CheckingIfAYearIsALeapYear {
    public static void main(String[] args) {
        int year=2024;
        boolean isLeapYear= Year.of(year).isLeap();
        System.out.println(year+ " is a leap year? " +isLeapYear);
    }
}
