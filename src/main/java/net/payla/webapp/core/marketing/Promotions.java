package net.payla.webapp.core.marketing;

public interface Promotions {
    public void addPromotion(Promotion promotion) throws Exception;

    public void deletePromotion(Promotion promotion) throws Exception;

    public void lookupPromotion(Promotion promotion) throws Exception;

    public void editPromotion(Promotion promotion) throws Exception;


}
