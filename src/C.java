import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 1/23/2022
 **/
public class C {

    public static void main(String[] args) {
        ArrayList<Item> items1 =  new ArrayList<>(Arrays.asList(
           new Item(1, "A", 10, 20),
           new Item(2, "B", 10, 20)
        ));

        ArrayList<Item> items2 =  new ArrayList<>(Arrays.asList(
                new Item(1, "A", 10, 20),
                new Item(2, "B", 10, 10)
        ));
        for (Item item1: items2) {
            for (Item item: items1) {
                Predicate<Item> greaterThanTen = (i) -> item.getQty() == item1.getQty();
                boolean b = items1.stream().allMatch(greaterThanTen);
                System.out.println("item = " + item.getName());
                System.out.println("b = " + b);
            }
        }

        items2.stream().forEach(item -> {System.out.println(item.getName()+" "+item.getQty());});

//        boolean b = items1.stream().allMatch(i -> i == items1.forEach(item -> {items1.stream().count()}););
//        System.out.println("b = " + b);
    }
}
