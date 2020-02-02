package net.payla.webapp.core.catalog.classes;

public class PropertyGroup {
    private int propertyGroupId;
    private String propertyGroupNamePersian;
    private String propertyGroupNameEnglish;
    private int propertyGroupOrderNum;

    public int getPropertyGroupId() {
        return propertyGroupId;
    }

    public void setPropertyGroupId(int propertyGroupId) {
        this.propertyGroupId = propertyGroupId;
    }

    public String getPropertyGroupNamePersian() {
        return propertyGroupNamePersian;
    }

    public void setPropertyGroupNamePersian(String propertyGroupNamePersian) {
        this.propertyGroupNamePersian = propertyGroupNamePersian;
    }

    public String getPropertyGroupNameEnglish() {
        return propertyGroupNameEnglish;
    }

    public void setPropertyGroupNameEnglish(String propertyGroupNameEnglish) {
        this.propertyGroupNameEnglish = propertyGroupNameEnglish;
    }

    public int getPropertyGroupOrderNum() {
        return propertyGroupOrderNum;
    }

    public void setPropertyGroupOrderNum(int propertyGroupOrderNum) {
        this.propertyGroupOrderNum = propertyGroupOrderNum;
    }
}
