package net.payla.webapp.core.sale.interfaces;

import net.payla.webapp.core.sale.ReturnedProduct;

public interface Returners {
    public void addReturnedProduct(ReturnedProduct returnedProduct) throws Exception;

    public void deleteReturnedProduct(ReturnedProduct returnedProduct) throws Exception;

    public void removeReturnedProduct(ReturnedProduct returnedProduct) throws Exception;

    public void editReturnedProduct(ReturnedProduct returnedProduct) throws Exception;
}
