
/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 1/27/2022
 **/

public class ViewItem {
    private String itemId;
    private String itemName;

    public ViewItem() {
    }

    public ViewItem(String itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "ViewItem{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
