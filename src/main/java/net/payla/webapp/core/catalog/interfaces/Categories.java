package net.payla.webapp.core.catalog.interfaces;

public interface Categories {
    public void addCategories(net.payla.webapp.core.catalog.classes.Categories categoriesObject) throws Exception;
    public void deleteCategories(net.payla.webapp.core.catalog.classes.Categories categoriesObject) throws Exception;
    public void editCategories(net.payla.webapp.core.catalog.classes.Categories categoriesObject) throws Exception;
    public void lookupCategories(net.payla.webapp.core.catalog.classes.Categories categoriesObject) throws Exception;
}
