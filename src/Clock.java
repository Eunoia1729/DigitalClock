
import java.util.TimeZone;
/**
 *
 * @author 6ix
 */
public class Clock {
    private Time time;
    
    Clock(){
        
    }
    
    public Time getTime() {
        time = new Time();
        return time;
    }
}
