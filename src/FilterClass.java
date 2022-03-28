import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 1/24/2022
 **/
public class FilterClass {
    public static void main(String[] args) {
        ArrayList<Item> items1 =  new ArrayList<>(Arrays.asList(
                new Item(1, "A", 10, 20),
                new Item(2, "B", 10, 20)
        ));

        ArrayList<Item> items2 =  new ArrayList<>(Arrays.asList(
                new Item(1, "A", 10, 20),
                new Item(2, "B", 10, 20),
                new Item(3, "C", 10, 20)
        ));

        Stream<Item> stream1 = items1.stream();
        Stream<Item> stream2 = items2.stream();

        Stream<Item> itemStream = stream1.filter(items2::contains);
        List<Item> items = itemStream.collect(Collectors.toList());
        System.out.println("items = " + items);
    }
}
