package net.payla.webapp.core.sale;

import net.payla.webapp.core.products.Product;
import net.payla.webapp.core.retailers.Retailer;

public class ReturnedProduct {
    private long returnedId;
    Retailer retailer;
    private long OrderId;
    private Product product;
    private ReturnedStatus returnedStatus;
    private long appendedDateTime;
    private long editedDateTime;

    public long getReturnedId() {
        return returnedId;
    }

    public void setReturnedId(long returnedId) {
        this.returnedId = returnedId;
    }

    public Retailer getRetailer() {
        return retailer;
    }

    public void setRetailer(Retailer retailer) {
        this.retailer = retailer;
    }

    public long getOrderId() {
        return OrderId;
    }

    public void setOrderId(long orderId) {
        OrderId = orderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ReturnedStatus getReturnedStatus() {
        return returnedStatus;
    }

    public void setReturnedStatus(ReturnedStatus returnedStatus) {
        this.returnedStatus = returnedStatus;
    }

    public long getAppendedDateTime() {
        return appendedDateTime;
    }

    public void setAppendedDateTime(long appendedDateTime) {
        this.appendedDateTime = appendedDateTime;
    }

    public long getEditedDateTime() {
        return editedDateTime;
    }

    public void setEditedDateTime(long editedDateTime) {
        this.editedDateTime = editedDateTime;
    }
}
