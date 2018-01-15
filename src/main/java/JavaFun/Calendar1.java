package JavaFun;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Hello world!
 *
 */
public class Calendar1
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }

    public static String getDay(String day, String month, String year) {
        /*
        * Write your code here.
        */

        int year_ = Integer.parseInt(year);
        int month_ = Integer.parseInt(month) - 1;
        int day_ = Integer.parseInt(day);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

        Calendar calendar = Calendar.getInstance();
        calendar.set(year_, month_, day_);

        String theDay = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.UK).toUpperCase();

        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

        int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
        int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
        int minute     = calendar.get(Calendar.MINUTE);
        int second     = calendar.get(Calendar.SECOND);
        int millisecond= calendar.get(Calendar.MILLISECOND);

//        System.out.println(sdf.format(calendar.getTime()));
//
//        System.out.println("year \t\t: " + year);
//        System.out.println("month \t\t: " + month);
//        System.out.println("dayOfMonth \t: " + dayOfMonth);
        System.out.println("dayOfWeek \t: " + dayOfWeek);
//        System.out.println("weekOfYear \t: " + weekOfYear);
//        System.out.println("weekOfMonth \t: " + weekOfMonth);
//
//        System.out.println("hour \t\t: " + hour);
//        System.out.println("hourOfDay \t: " + hourOfDay);
//        System.out.println("minute \t\t: " + minute);
//        System.out.println("second \t\t: " + second);
//        System.out.println("millisecond \t: " + millisecond);

        return theDay;
    }
}
