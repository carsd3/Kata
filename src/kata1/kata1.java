package kata1;

import java.util.Date;

public class kata1 {
    public static void main(String[] args) {
        Person a = new Person("Carlos", new Date(101,7,1));
        System.out.println(a.getName() + " tiene " + a.getAge() + " años y nació en " + a.getBirthDate());
    }
}
