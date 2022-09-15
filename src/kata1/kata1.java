package kata1;

import java.time.*;

public class kata1 {
    public static void main(String[] args) {
        Person a = new Person("Carlos", LocalDate.of(2001, 8, 1));
        System.out.println(a.getName() + " tiene " + a.getAge() + " años");
    }
}
