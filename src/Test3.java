import java.util.*;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 1/27/2022
 **/
public class Test3 {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>();

        // Adding all elements to List
        a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

        // Again declaring object of Set class
        // with reference to HashSet
        Set<Integer> b = new HashSet<Integer>();

        b.addAll(Arrays.asList(
                new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

        Set<String> s1 = new HashSet<String>();
        s1.addAll(Arrays.asList(new String[] {"Nipun", "Chathuranga", "Jayalath", "Person1", "Person2"}));
        Set<String> s2 = new HashSet<String>();
        s1.addAll(Arrays.asList(new String[] {"PersonA", "PersonB", "PersonC", "Person1", "Person2"}));

        Set<String> union1 = new HashSet<String>(s1);
        union1.addAll(s2);
        System.out.println("union1 = " + union1);


        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
    }
}
