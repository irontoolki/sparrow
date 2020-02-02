package net.payla.webapp.core.catalog.classes;

public class Filters {
    public long filterId;
    public String filterNamePersian;
    public String filterNameEnglish;
    public int filterOrderNum;

    public long getFilterId() {
        return filterId;
    }

    public void setFilterId(long filterId) {
        this.filterId = filterId;
    }

    public String getFilterNamePersian() {
        return filterNamePersian;
    }

    public void setFilterNamePersian(String filterNamePersian) {
        this.filterNamePersian = filterNamePersian;
    }

    public String getFilterNameEnglish() {
        return filterNameEnglish;
    }

    public void setFilterNameEnglish(String filterNameEnglish) {
        this.filterNameEnglish = filterNameEnglish;
    }

    public int getFilterOrderNum() {
        return filterOrderNum;
    }

    public void setFilterOrderNum(int filterOrderNum) {
        this.filterOrderNum = filterOrderNum;
    }
}
