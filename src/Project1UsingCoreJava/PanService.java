package Project1UsingCoreJava;

import java.util.HashMap;
import java.util.Map;

public class PanService {
    private static Map<String, Pan> panMap = new HashMap<>();

    static {
        panMap.put("EKKSJDF123NN", new Pan("EKKSJDF123NN", "27450981", "SBI LAR", "STOCK , HEDGE FUND , FD , REAL ESTATE"));
        panMap.put("KDIEKIF123DJ", new Pan("KDIEKIF123DJ", "24853521", "HDFC DEHRADUN", " FD , REAL ESTATE"));
        panMap.put("CNJFIJE453KD", new Pan("CNJFIJE453KD", "10250125", "SBI SATNA", "STOCK , FD, REAL ESTATE"));
    }


    public Pan getPanByAadhaarNumber(String aadhaarNumber)
    {
        for (Pan pan : panMap.values())//in map we have map<key - value> now when we write only panMap.values() then iterator will print all the values and leave the key
        //and values are object of type Pan
        {
             System.out.println(pan);//this will print the values of the in map hash table
            //now after calling the sout(pan) , it will automatically call toString() since you have overriden it in Pan class now to understand it go into string package
            if (pan.getAadhaarNumber().equals(aadhaarNumber))
            {
                return pan;
            }

        }
        return null;
    }

}
