import java.util.*;
import java.util.stream.Collectors;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 1/24/2022
 **/
public class Test {
    public static void main(String[] args) {
        List<Person> people = getPerson();

        List<Person> females = new ArrayList<>();

        for (Person person: people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        females.forEach(System.out :: println);

        System.out.println();
        System.out.println("Filter function......................");
        List<Person> collect = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
        collect.forEach(System.out :: println);

        System.out.println();
        System.out.println("Sorted function......................");
        List<Person> sortedArray = people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        sortedArray.forEach(System.out::println);

        System.out.println();
        System.out.println("Sorted and reversed function......................");
        List<Person> sortedAndReversed = people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
        sortedAndReversed.forEach(System.out::println);

        System.out.println();
        System.out.println("Sorted and reversed Comparing function......................");
        List<Person> sortedAndReversedAndComparing = people.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed()).collect(Collectors.toList());
        sortedAndReversedAndComparing.forEach(System.out::println);

        System.out.println();
        System.out.println("All match function....................");
        boolean match = people.stream().allMatch(person -> person.getAge() == 10);
        System.out.println("match = " + match);
        boolean match1 = people.stream().allMatch(person -> person.getAge() == 25);
        System.out.println("match1 = " + match1);
        System.out.println();

        System.out.println("Any match function.....................");
        boolean anyMatch = people.stream().anyMatch(person -> person.getAge() == 10);
        System.out.println("anyMatch = " + anyMatch);
        boolean anyMatch1 = people.stream().anyMatch(person -> person.getAge() == 25);
        System.out.println("anyMatch1 = " + anyMatch1);
        System.out.println();

        System.out.println("Non match function......................");
        boolean noneMatch = people.stream().noneMatch(person -> person.getName().equals("Kasun"));
        System.out.println("noneMatch = " + noneMatch);
        boolean noneMatch1 = people.stream().noneMatch(person -> person.getName().equals("Nipun"));
        System.out.println("noneMatch1 = " + noneMatch1);

        System.out.println();
        System.out.println("Max function.............................");
        people.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

        System.out.println();
        System.out.println("Min function.............................");
        people.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

        System.out.println();
        System.out.println("Group function...........................");
        Map<Gender, List<Person>> group = people.stream().collect(Collectors.groupingBy(Person::getGender));
        group.forEach(((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out :: println);
            System.out.println();
        }));

        System.out.println();
        System.out.println("oldest female age.......................");
        Optional<String> oldestFemaleAge = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        oldestFemaleAge.ifPresent(System.out::println);


    }

    void find(Collection<Person> people, int value){
        boolean anyMatch1 = people.stream().anyMatch(person -> person.getAge() == value);
    }

    private static List<Person> getPerson(){
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
