package net.payla.webapp.core.catalog.classes;

import net.payla.webapp.core.catalog.interfaces.PropertiesGroup;

public class Property {

    public String propertyId;
    public String propertyNamePersian;
    public String propertyNameEnglish;
    public PropertiesGroup propertiesGroup;
    public Categories categories;
    public int propertyOrderNum;

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyNamePersian() {
        return propertyNamePersian;
    }

    public void setPropertyNamePersian(String propertyNamePersian) {
        this.propertyNamePersian = propertyNamePersian;
    }

    public String getPropertyNameEnglish() {
        return propertyNameEnglish;
    }

    public void setPropertyNameEnglish(String propertyNameEnglish) {
        this.propertyNameEnglish = propertyNameEnglish;
    }

    public PropertiesGroup getPropertiesGroup() {
        return propertiesGroup;
    }

    public void setPropertiesGroup(PropertiesGroup propertiesGroup) {
        this.propertiesGroup = propertiesGroup;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public int getPropertyOrderNum() {
        return propertyOrderNum;
    }

    public void setPropertyOrderNum(int propertyOrderNum) {
        this.propertyOrderNum = propertyOrderNum;
    }
}
