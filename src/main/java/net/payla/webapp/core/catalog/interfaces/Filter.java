package net.payla.webapp.core.catalog.interfaces;

import net.payla.webapp.core.catalog.classes.Filters;

public interface Filter {
    public void addFilter(Filters filterObject) throws Exception;
    public void deleteFilter(Filters filterObject) throws Exception;
    public void lookupFilter(Filters filterObject) throws Exception;
    public void editFilter(Filters filterObject) throws Exception;

}
