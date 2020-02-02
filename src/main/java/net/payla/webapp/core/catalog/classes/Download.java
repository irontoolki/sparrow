package net.payla.webapp.core.catalog.classes;

import java.net.URL;

public class Download {
    private String downloadSubjectPersian;
    private String downloadSubjectEnglish;
    private URL downlandURL;
    private String coverage;

    public String getDownloadSubjectPersian() {
        return downloadSubjectPersian;
    }

    public void setDownloadSubjectPersian(String downloadSubjectPersian) {
        this.downloadSubjectPersian = downloadSubjectPersian;
    }

    public String getDownloadSubjectEnglish() {
        return downloadSubjectEnglish;
    }

    public void setDownloadSubjectEnglish(String downloadSubjectEnglish) {
        this.downloadSubjectEnglish = downloadSubjectEnglish;
    }

    public URL getDownlandURL() {
        return downlandURL;
    }

    public void setDownlandURL(URL downlandURL) {
        this.downlandURL = downlandURL;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }
}
