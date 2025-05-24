package JavaCollections.DateAndTImeAPI;

import java.time.LocalDate;

public class AddingDaysToADate {
    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        LocalDate futureDate=date.plusDays(10);
        System.out.println("Future Date: "+futureDate);
        /*
                EXPLAINATION OF THE CODE

           1. LocalDate date= LocalDate.now();
                    This line creates a LocalDate object representing the current data based on your system clock.
                    For example, if today is 2025-05-23 , then date becomes 2025-05-23.

           2. LocalDate futureDate=date.plusDays(10);
                    This line adds 10 calender days to the date.
                    It doesn't care if the days are Monday, Tuesday etc. It counts calender days, meaning it includes
                    weekdays, weekends, and even holidays.
                    ie; If today is Friday , May 23 , 2025, then:-
                    date.plusDays(10) will result in Monday , June 2, 2025.

           3. System.out.println("Future Date: "+futureDate);
                    Simply prints the new Date (10 days after today).


         */

    }
}
