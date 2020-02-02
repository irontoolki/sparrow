package net.payla.webapp.core.storehouse.interfaces;

public interface StoreHouse {
    public void addStoreHouse(StoreHouse storeHouse) throws Exception;
    public void deleteStoreHouse(StoreHouse storeHouse) throws Exception;
    public void editStoreHouse(StoreHouse storeHouse) throws Exception;
    public void lookupStoreHouse(StoreHouse storeHouse) throws Exception;
}
