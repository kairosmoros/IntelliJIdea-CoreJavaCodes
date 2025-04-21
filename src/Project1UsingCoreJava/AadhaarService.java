package Project1UsingCoreJava;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService
{
    private static Map<String, Aadhaar> aadhaarMap = new HashMap<>();
static //static block runs only when the class(here AadhaarService) loads so when class AadhaarService loads I want to put data
{
    aadhaarMap.put("27450981" ,new Aadhaar("27450981" , "Prashant Yadav" , "Ram Adhar Yadav" , "City Salempur, Uttar Pradesh" ));
    aadhaarMap.put("24853521" , new Aadhaar("24853521" ,"Anmol Kumar" , "Mr. Yogendra" , "City Salempur , Uttar Pradesh"));
    aadhaarMap.put("10250125" , new Aadhaar("10250125" , "Manas Dwivedi" , "Ram Kinkar Dwivedi" , " City Satna , Madhya Pradesh"));

}
    public Aadhaar getAadhaarByNumber(String aadhaarNumber)
    {
        return aadhaarMap.get(aadhaarNumber);//this will return the aadhaar number
    }

}
