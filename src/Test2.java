import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 1/25/2022
 **/
public class Test2 {
    public static void main(String[] args) {
        List<Person> person1 = getPerson1();
        List<Person> person2 = getPerson2();
        for (Person person : person2) {
            boolean b = person1.stream().anyMatch(per -> per.getName() == person.getName());
            System.out.println(person.getName()+" = "+b);
        }

    }

    private static List<Person> getPerson1(){
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Nipun", 10, Gender.MALE),
                new Person("Chathuranga", 20, Gender.MALE),
                new Person("Malinga", 30, Gender.FEMALE),
                new Person("Enoke", 40, Gender.FEMALE),
                new Person("Waruna", 50, Gender.MALE),
                new Person("Madushanka", 60, Gender.FEMALE),
                new Person("Udara", 70, Gender.FEMALE),
                new Person("Deshan", 80, Gender.MALE),
                new Person("Janidu", 90, Gender.FEMALE),
                new Person("Gayash", 100, Gender.MALE)
        ));
        return people;
    }

    private static List<Person> getPerson2(){
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Nipun", 10, Gender.MALE),
                new Person("Chathuranga", 20, Gender.MALE),
                new Person("Malinga", 30, Gender.FEMALE),
                new Person("Enoke", 40, Gender.FEMALE),
                new Person("Waruna", 50, Gender.MALE),
                new Person("Madushanka", 60, Gender.FEMALE),
                new Person("Udara", 70, Gender.FEMALE),
                new Person("Deshan", 80, Gender.MALE),
                new Person("Janidu", 90, Gender.FEMALE),
                new Person("Gayash", 100, Gender.MALE)
        ));
        return people;
    }
}
