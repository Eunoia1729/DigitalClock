
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
    private int date;
    private String timeZone;
    
    Time(String timeZone){
        //System.out.println(timeZone);
        this.timeZone=timeZone;
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone(timeZone));
        hours = calendar.get(Calendar.HOUR);
        minutes = calendar.get(Calendar.MINUTE);
        seconds = calendar.get(Calendar.SECOND);
        dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);
        date= calendar.get(Calendar.DATE);
    }
    public void setTimeZone(String timeZone)
    {
        this.timeZone=timeZone;
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
    public String daysToStirng()
    {
        String ret= getMonthName(month)+" "+stringConvert(date)+", "+stringConvert(year);
        return ret;
    }
    public String getMonthName(int index)
    {
        switch (index)
        {
            case 1:return "January";
            case 2:return "February";
            case 3:return "March";
            case 4:return "April";
            case 5:return "May";
            case 6:return "June";
            case 7:return "July";
            case 8:return "August";
            case 9:return "September";
            case 10:return "October";
            case 11:return "November";
            case 12:return "December";   
        }
        return "";
    }
}
