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
    private int am_pm;
    private int year;
    private String day;
    private int date;
    private String timeZone;
    private int flag;

    Time(String timeZone){
        //System.out.println(timeZone);
        this.timeZone=timeZone;
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone(timeZone));
        hours = calendar.get(Calendar.HOUR);
        minutes = calendar.get(Calendar.MINUTE);
        am_pm=calendar.get(Calendar.AM_PM);
        seconds = calendar.get(Calendar.SECOND);
        dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);
        date= calendar.get(Calendar.DATE);
        flag = 0;
        int day1 = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day1)
        {
            case Calendar.SUNDAY:
                day = "Sunday";
                break;
            case Calendar.MONDAY:
                day = "Monday";
                break;
            case Calendar.TUESDAY:
                day = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                day = "Wednesday";
                break;
            case Calendar.THURSDAY:
                day = "Thursday";
                break;
            case Calendar.FRIDAY:
                day = "Friday";
                break;
            case Calendar.SATURDAY:
                day = "Saturday";
                break;
        }

            }
    Time(String timeZone, int val){
        //System.out.println(timeZone);
        this.timeZone=timeZone;
        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone(timeZone));
        hours = calendar.get(Calendar.HOUR);
        String am=stringConvert(am_pm);
        if(am.equals("01"))
             hours = calendar.get(Calendar.HOUR) + 12;
        minutes = calendar.get(Calendar.MINUTE);
        am_pm=calendar.get(Calendar.AM_PM);
        seconds = calendar.get(Calendar.SECOND);
        dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);
        date= calendar.get(Calendar.DATE);
        flag = 0;
        int day1 = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day1)
        {
            case Calendar.SUNDAY:
                day = "Sunday";
                break;
            case Calendar.MONDAY:
                day = "Monday";
                break;
            case Calendar.TUESDAY:
                day = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                day = "Wednesday";
                break;
            case Calendar.THURSDAY:
                day = "Thursday";
                break;
            case Calendar.FRIDAY:
                day = "Friday";
                break;
            case Calendar.SATURDAY:
                day = "Saturday";
                break;
        }

        }
    Time(String time, String day) {
        String[] ti = time.split(":");
        hours = Integer.valueOf(ti[0]);
        minutes = Integer.valueOf(ti[1]);
        seconds = Integer.valueOf(ti[2]);
        this.day = day;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    Time(String hours1, String minutes1, String seconds1, String day1)
    {
        this.hours = Integer.parseInt(hours1);
        this.minutes = Integer.parseInt(minutes1);
        this.seconds = Integer.parseInt(seconds1);
        this.day = day1;
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
    
    public String toggle()
    {
        String res;
        String am=stringConvert(am_pm);
        if(am.equals("01"))
            res = stringConvert(hours+12)+":"+stringConvert(minutes)+":"+stringConvert(seconds);
        else
            res = stringConvert(hours)+":"+stringConvert(minutes)+":"+stringConvert(seconds);
        return res;
    }
    
    public String getAM()
    {
        String am=stringConvert(am_pm);
        if(am.equals("01"))
            am="PM";
        else
            am="AM";
        return am;
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
            case 0:return "January";
            case 1:return "February";
            case 2:return "March";
            case 3:return "April";
            case 4:return "May";
            case 5:return "June";
            case 6:return "July";
            case 7:return "August";
            case 8:return "September";
            case 9:return "October";
            case 10:return "November";
            case 11:return "December";   
        }
        return "";
    }
}
