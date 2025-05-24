package JavaCollections.DateAndTImeAPI;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingTimeWithSeconds1 {
    public static void main(String[] args) {
        // Creating a time: 15 hours, 59 minutes, 12 seconds (i.e., 3:59:12 PM)
        LocalTime time= LocalTime.now();
        // Creating a formatter for HH:mm:ss (24-hour format with seconds)
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("HH 'Hours':mm 'Minutes' :ss 'Seconds'");
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



        /*
        .format(formatter) takes that time (which is made of integers like 15, 59, 12 internally) and converts it into a formatted String using the pattern you gave.

So "HH:mm:ss" means:

HH → 2-digit hour (like 15)

mm → 2-digit minute (like 59)

ss → 2-digit second (like 12)

This turns into the string: "15:59:12"

❓ Why is the result stored in a String?
Even though the time components (hour, minute, second) are integers:

Formatting is about creating a text version of the object.

That’s why the result is not int or LocalTime — it’s a String.

You’re saying:

“Hey Java, turn this time object into a readable string in this pattern.”

🧠 Analogy:
Think of it like converting a number into words:

int amount = 500;

String formatted = "₹" + amount; → Now it's not a number, it’s the string "₹500".

Similarly:

LocalTime time = LocalTime.of(15, 59, 12);

String formattedTime = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

Result: "15:59:12"


         */

        // Printing the formatted time
        System.out.println("Formatted Time: " +formattedTime);
    }
}
