package kata1;


import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Person {
    private final String name;
    private final LocalDate birthdate;
    private final long MILLISECOND_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, LocalDate birth) {
        this.name = name;
        this.birthdate = birth;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthdate;
    }

    public int getAge() {
        LocalDate actual = LocalDate.now();
        return (int) Period.between(this.getBirthDate(), actual).getYears();
    }
}
