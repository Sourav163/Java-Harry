package Java_Harry;

import java.util.Calendar;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getTime());
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTimeZone());
        System.out.println(Calendar.getAvailableCalendarTypes());
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    }
}
