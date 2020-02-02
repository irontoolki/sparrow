package net.payla.webapp.core.catalog.interfaces;

import net.payla.webapp.core.catalog.classes.Property;

public interface Properties {
    public void addProperties(Property propertyObject) throws Exception;
    public void deleteProperties(Property propertyObject) throws Exception;
    public void editProperties(Property propertyObject) throws Exception;
    public void lookupProperties(Property propertyObject) throws Exception;
}
