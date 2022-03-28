import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 1/28/2022
 **/
public class Test4 {
    public static void main(String[] args) {
        Set<Person> people1 = new HashSet<Person>();
        people1.addAll(Arrays.asList(new Person[]{
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
        }));

        Set<Person> people2 = new HashSet<Person>();
        people2.addAll(Arrays.asList(new Person[]{
                new Person("Nipun", 10, Gender.MALE),
                new Person("Chathuranga", 20, Gender.MALE),
                new Person("Malinga1", 30, Gender.FEMALE),
                new Person("Enoke1", 40, Gender.FEMALE),
                new Person("Waruna1", 50, Gender.MALE),
                new Person("Madushanka1", 60, Gender.FEMALE),
                new Person("Udara1", 70, Gender.FEMALE),
                new Person("Deshan1", 80, Gender.MALE),
                new Person("Janidu1", 90, Gender.FEMALE),
                new Person("Gayash1", 100, Gender.MALE)
        }));

        Set<Person> union =  new HashSet<>(people1);
        union.addAll(people2);
        System.out.println("union = " + union);
        int size = union.size();
        System.out.println("size = " + size);

        Set<Person> intersection = new HashSet<Person>(people1);
        intersection.retainAll(people2);
        System.out.println("intersection = " + intersection);
        int size1 = intersection.size();
        System.out.println("size1 = " + size1);

        Set<Person> difference = new HashSet<Person>(people1);
        difference.removeAll(people2);
        System.out.println("difference = " + difference);
        int size2 = difference.size();
        System.out.println("size2 = " + size2);
    }
}
