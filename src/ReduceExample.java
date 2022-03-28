import java.util.Arrays;
import java.util.List;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 1/23/2022
 **/
public class ReduceExample {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(1, "A", 10, 10),
                new Item(2, "B", 20, 20),
                new Item(3, "C", 30, 30),
                new Item(4, "D", 40, 40),
                new Item(5, "E", 50, 50)
        );
//        int result = items.stream()
//                .reduce(0, (partialAgeResult, item) -> partialAgeResult + item.getQty(), Integer::sum);
//        System.out.println("result = " + result);
    }
}
