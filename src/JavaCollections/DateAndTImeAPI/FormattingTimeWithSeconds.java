package JavaCollections.DateAndTImeAPI;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingTimeWithSeconds {
    public static void main(String[] args) {
        // Creating a time: 15 hours, 59 minutes, 12 seconds (i.e., 3:59:12 PM)
        LocalTime time= LocalTime.of(15,59,12);
        // Creating a formatter for HH:mm:ss (24-hour format with seconds)
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("HH:mm:ss");
      //  DateTimeFormatter formatter= DateTimeFormatter.ofPattern("HH 'Hours' :mm 'Minutes' :ss 'Seconds'");

        /*
        🔍 Why does "HH:mm:ss" work but "hour:minute:second" doesn't?
The reason is:

DateTimeFormatter.ofPattern(...) expects a specific pattern syntax, not natural language words like "hour" or "minute".

✅ What Works (Pattern Symbols):
Symbol	 Meaning	      Example Output
HH	    Hour (00–23)	  15
mm	    Minute (00–59)	  09
ss	    Second (00–59)	  47

These are fixed symbols defined by the DateTimeFormatter API, and Java uses them to parse or format date/time values correctly.

❌ What Doesn't Work:
If you do something like this:


DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hour:minute:second");
You'll get an error like:


java.lang.IllegalArgumentException: Unknown pattern letter: h
Because Java tries to interpret "h", "o", "u", etc., as pattern symbols — and they are not valid in that context.

✅ Correct Usage:

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // Correct!
🔁 If You Want Literal Words:
If you want the output to literally say "hour", "minute", etc., you must use single quotes to escape them:

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'hour:'HH 'minute:'mm 'second:'ss");
🔍 Output:
hour:15 minute:59 second:12
So Java sees:
'hour:' → Literal text
HH → Format hour
'minute:' → Literal
mm → Format minute
'second:' → Literal
ss → Format second

        Letter	        Component	                Example
            y	        Year	                    2025
            M	        Month	                    05
            d	        Day	                        23
            E	        Day of week	                Thu
            H	        Hour (0–23)	                15
            h	        Hour (1–12)	                3
            m	        Minute	                    30
            s	        Second	                    45
         'text'	        Literal text	           'hour:'

         */

        // Formatting the time object using the formatter
        String formattedTime=time.format(formatter);

        // Printing the formatted time
        System.out.println("Formatted Time: " +formattedTime);
    }
}
