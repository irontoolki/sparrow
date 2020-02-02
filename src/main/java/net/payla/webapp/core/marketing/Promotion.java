package net.payla.webapp.core.marketing;

import net.payla.webapp.core.products.Product;
import net.payla.webapp.core.suppliers.Supplier;

public class Promotion {
    private int promotionId;
    private String subject;
    private  boolean isEnabled;
    private Supplier supplier;
    private boolean sponsoredByPaola;
    private long dateStart;
    private long dateEnd;
    private float factorTotalOrder;
    private boolean isCashed;
    private float promotionPercentage;
    private Product productAsGift;
    private int productAsGiftCount;
    private String productAsGiftUnit;

    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public boolean isSponsoredByPaola() {
        return sponsoredByPaola;
    }

    public void setSponsoredByPaola(boolean sponsoredByPaola) {
        this.sponsoredByPaola = sponsoredByPaola;
    }

    public long getDateStart() {
        return dateStart;
    }

    public void setDateStart(long dateStart) {
        this.dateStart = dateStart;
    }

    public long getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(long dateEnd) {
        this.dateEnd = dateEnd;
    }

    public float getFactorTotalOrder() {
        return factorTotalOrder;
    }

    public void setFactorTotalOrder(float factorTotalOrder) {
        this.factorTotalOrder = factorTotalOrder;
    }

    public boolean isCashed() {
        return isCashed;
    }

    public void setCashed(boolean cashed) {
        isCashed = cashed;
    }

    public float getPromotionPercentage() {
        return promotionPercentage;
    }

    public void setPromotionPercentage(float promotionPercentage) {
        this.promotionPercentage = promotionPercentage;
    }

    public Product getProductAsGift() {
        return productAsGift;
    }

    public void setProductAsGift(Product productAsGift) {
        this.productAsGift = productAsGift;
    }

    public int getProductAsGiftCount() {
        return productAsGiftCount;
    }

    public void setProductAsGiftCount(int productAsGiftCount) {
        this.productAsGiftCount = productAsGiftCount;
    }

    public String getProductAsGiftUnit() {
        return productAsGiftUnit;
    }

    public void setProductAsGiftUnit(String productAsGiftUnit) {
        this.productAsGiftUnit = productAsGiftUnit;
    }
}
