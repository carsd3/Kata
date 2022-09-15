package kata1;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthdate;
    private final long MILLISECOND_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, Calendar birth) {
        this.name = name;
        this.birthdate = birth;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthDate() {
        return birthdate;
    }

    public int getAge() {
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis() - birthdate.getTimeInMillis()));
    }

    private long milliSecondsToYear(long mill) {
        return mill / MILLISECOND_PER_YEAR;
    }
}
