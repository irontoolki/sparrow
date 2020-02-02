/*
 * Copyright (c) 2020. Payla E-Commercial Group
 */

package net.payla.webapp.core.products;

import net.payla.webapp.core.unitclass.TaxType;

public class TaxClass {
    private String taxSubject;
    private float taxRate;
    private TaxType taxType;

    public String getTaxSubject() {
        return taxSubject;
    }

    public void setTaxSubject(String taxSubject) {
        this.taxSubject = taxSubject;
    }

    public float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }

    public TaxType getTaxType() {
        return taxType;
    }

    public void setTaxType(TaxType taxType) {
        this.taxType = taxType;
    }
}
