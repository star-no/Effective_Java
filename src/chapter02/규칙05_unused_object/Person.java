package chapter02.규칙05_unused_object;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by star.no
 * on 2017. 2. 6..
 */

public class Person {
    private Date birthDate;

    //    public boolean isBabyBoomer() {
//        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
//        gmtCal.set(1946, Calendar.JANUARY, 1, 0,0, 0);
//        Date boomStart = gmtCal.getTime();
//        gmtCal.set(1965, Calendar.JANUARY, 1, 0,0, 0);
//        Date boomEnd = gmtCal.getTime();
//
//        return birthDate.compareTo(boomStart) >= 0 &&
//                    birthDate.compareTo(boomEnd) < 0;
//    }
    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_END = gmtCal.getTime();
    }
    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START) >= 0 &&
                birthDate.compareTo(BOOM_END) < 0;
    }
}
