import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 1/31/2022
 **/
public class ProductMain {
    public static void main(String[] args) {
        ProductList currentList = getCurrentList();
        System.out.println("currentList = " + currentList);
    }

    public static ProductList getCurrentList() {
        ProductList productList = new ProductList();
        ArrayList<ItemList> itemLists = new ArrayList<>();
        ArrayList<BatchList> batchLists = new ArrayList<>();
        batchLists.add(new BatchList(new ViewBatch("B001", "I001", new BigDecimal(25)), 25));
        batchLists.add(new BatchList(new ViewBatch("B002", "I001", new BigDecimal(25)), 25));
        batchLists.add(new BatchList(new ViewBatch("B003", "I001", new BigDecimal(50)), 50));
        ItemList itemList1 = new ItemList(new ViewItem("I001", "A"), 100, batchLists);
        ItemList itemList2 = new ItemList(new ViewItem("I002", "B"), 200, batchLists);
        ItemList itemList3 = new ItemList(new ViewItem("I003", "C"), 300, batchLists);
        itemLists.add(itemList1);
        itemLists.add(itemList2);
        itemLists.add(itemList3);
        productList.setItemLists(itemLists);

        return productList;
    }

    public static ProductList getReloadingList() {

        return null;
    }
}
