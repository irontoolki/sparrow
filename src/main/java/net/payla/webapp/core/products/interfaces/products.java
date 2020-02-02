/*
 * Copyright (c) 2020. Payla E-Commercial Group
 */

package net.payla.webapp.core.products.interfaces;

public interface products {

    public void addProduct(products products) throws Exception;

    public void deleteProduct(products products) throws Exception;

    public void lookupProduct(products products) throws Exception;

    public void editProduct(products products) throws Exception;

    //todo in the case of total list in dashboard, we need batch query, etc.

}
