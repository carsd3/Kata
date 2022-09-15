package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class kata1 {
    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2001, 8, 1);
        Person a = new Person("Carlos", date);
        System.out.println(a.getName() + " tiene " + a.getAge() + " años");
    }
}
