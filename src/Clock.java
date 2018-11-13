
import java.util.TimeZone;
/**
 *
 * @author 6ix
 */
public class Clock {
    private Time time;
    
    Clock(){
        
    }
    
    public Time getTime(String timeZone) {
        time = new Time(timeZone);
        return time;
    }
    
    public String getDay()
    {
        return time.daysToStirng();
    }
}
