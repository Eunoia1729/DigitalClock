import java.util.TimeZone;
/**
 *
 * @author 6ix
 */
public class Clock {
    private Time time;
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    Clock(){
        properties = new Properties();
    }
    
    public Time getTime(String timeZone) {
        time = new Time(timeZone);
        return time;
    }
    public Time getTime(String timeZone, int val) {
        time = new Time(timeZone, val);
        return time;
    }
    
    public String getDay()
    {
        return time.daysToStirng();
    }
}
