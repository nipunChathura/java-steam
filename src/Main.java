import java.util.*;
import java.util.stream.Collectors;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 1/21/2022
 **/
public class Main {
    public static void main(String[] args) {
        HashSet<Item> items1 = new HashSet<>();
        items1.add(new Item(1, "A", 25, 10));
        items1.add(new Item(2, "B", 35, 20));
        items1.add(new Item(3, "C", 45, 30));

        HashSet<Item> items2 = new HashSet<>();
        items2.add(new Item(1, "A", 25, 10));
        items2.add(new Item(2, "B", 35, 20));
        items2.add(new Item(3, "C", 45, 30));
        items2.add(new Item(4, "D", 55, 40));

        System.out.println(items1.equals(items2));

        System.out.println(items1);

        double total = (items1.stream().mapToDouble(item -> item.getQty() * item.getPrice()).sum());
        System.out.println("total = " + total);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(result);

        int result1 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(result1);
    }

}
