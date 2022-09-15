package kata1;


import java.util.Date;

public class Person {
    private final String name;
    private final Date birthdate;

    public Person(String name, Date birth) {
        this.name = name;
        this.birthdate = birth;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthdate;
    }

    public int getAge() {
        return (int) ((new Date().getTime() - this.getBirthDate().getTime())/31536000000L);
    }
}
