
/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 12/16/2021
 **/

class BatchList {
    private ViewBatch batch;
    private double batchLoadingQty;

    public BatchList() {
    }

    public BatchList(ViewBatch batch, double batchLoadingQty) {
        this.batch = batch;
        this.batchLoadingQty = batchLoadingQty;
    }

    public ViewBatch getBatch() {
        return batch;
    }

    public void setBatch(ViewBatch batch) {
        this.batch = batch;
    }

    public double getBatchLoadingQty() {
        return batchLoadingQty;
    }

    public void setBatchLoadingQty(double batchLoadingQty) {
        this.batchLoadingQty = batchLoadingQty;
    }

    @Override
    public String toString() {
        return "BatchList{" +
                "batch=" + batch +
                ", batchLoadingQty=" + batchLoadingQty +
                '}';
    }
}
