
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
/**
 *
 * @author 6ix 
 */
class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private int dayOfMonth;
    private int month;
    private int year;
    private String day;
    
    Time(){
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("IST"));
        hours = calendar.get(Calendar.HOUR);
        minutes = calendar.get(Calendar.MINUTE);
        seconds = calendar.get(Calendar.SECOND);
        dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);
    }
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public String stringConvert(int val) {
        if( String.valueOf(val).length() == 1)
        {
            return "0"+String.valueOf(val);
        }
        return String.valueOf(val);
    }

    public String getDay() {
        return day;
    }
    public String toString(){
        String res = stringConvert(hours)+":"+stringConvert(minutes)+":"+stringConvert(seconds);
        return res;
    }
}
