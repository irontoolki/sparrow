package net.payla.webapp.core.catalog.interfaces;

import net.payla.webapp.core.catalog.classes.Download;

public interface Downloads {
    public void addDownload(Download downloadObject) throws Exception;
    public void deleteDownload(Download downloadObject) throws Exception;
    public void lookuoDownload(Download downloadObject) throws Exception;
    public void editDownload(Download downloadObject) throws Exception;
}
