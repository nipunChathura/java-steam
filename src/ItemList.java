import java.util.ArrayList;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 12/16/2021
 **/

public class ItemList {
    private ViewItem item;
    private double itemLoadingQty;
    private ArrayList< BatchList> batchLists;

    public ItemList() {
    }

    public ItemList(ViewItem item, double itemLoadingQty, ArrayList<BatchList> batchLists) {
        this.item = item;
        this.itemLoadingQty = itemLoadingQty;
        this.batchLists = batchLists;
    }

    public ViewItem getItem() {
        return item;
    }

    public void setItem(ViewItem item) {
        this.item = item;
    }

    public double getItemLoadingQty() {
        return itemLoadingQty;
    }

    public void setItemLoadingQty(double itemLoadingQty) {
        this.itemLoadingQty = itemLoadingQty;
    }

    public ArrayList<BatchList> getBatchLists() {
        return batchLists;
    }

    public void setBatchLists(ArrayList<BatchList> batchLists) {
        this.batchLists = batchLists;
    }

    @Override
    public String toString() {
        return "ItemList{" +
                "item=" + item +
                ", itemLoadingQty=" + itemLoadingQty +
                ", batchLists=" + batchLists +
                '}';
    }
}
