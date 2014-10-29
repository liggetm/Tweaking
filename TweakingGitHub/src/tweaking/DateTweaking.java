package tweaking;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTweaking {
    
    public static void main(String[] args) {
        
        long epochInput = Long.parseLong("1175299473") * 1000;
        final Date date = new Date(epochInput); //date read as GMT value
        System.out.println("Date = " + date);   //date printed in system's timezone
        final SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z");
        dateFormatter.setTimeZone(TimeZone.getTimeZone("GMT")); //use formatter to specify timezone
        System.out.println("Formatted date: " + dateFormatter.format(date));    
       
    }
}
