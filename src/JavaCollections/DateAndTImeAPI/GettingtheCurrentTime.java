package JavaCollections.DateAndTImeAPI;

import java.time.LocalTime;

public class GettingtheCurrentTime {
    public static void main(String[] args) {
        LocalTime currentTime= LocalTime.now();
        System.out.println("Current Time: " +currentTime);
    }
}
