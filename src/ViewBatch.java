
import java.math.BigDecimal;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 1/27/2022
 **/

public class ViewBatch {
    private String batchId;
    private String itemId;
    private BigDecimal basePrice;

    public ViewBatch() {
    }

    public ViewBatch(String batchId, String itemId, BigDecimal basePrice) {
        this.batchId = batchId;
        this.itemId = itemId;
        this.basePrice = basePrice;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return "ViewBatch{" +
                "batchId='" + batchId + '\'' +
                ", itemId='" + itemId + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
