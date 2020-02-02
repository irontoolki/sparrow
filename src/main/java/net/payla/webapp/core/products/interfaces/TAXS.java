package net.payla.webapp.core.products.interfaces;

import net.payla.webapp.core.products.TaxClass;

public interface TAXS {
    public void addTax(TaxClass taxClass) throws Exception;

    public void deleteTax(TaxClass taxClass) throws Exception;

    public void editTax(TaxClass taxClass) throws Exception;

    public void lookupTax(TaxClass taxClass) throws Exception;


}
