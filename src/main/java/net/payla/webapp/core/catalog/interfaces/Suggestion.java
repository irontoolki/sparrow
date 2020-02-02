package net.payla.webapp.core.catalog.interfaces;

import net.payla.webapp.core.catalog.classes.Suggestions;

public interface Suggestion {
    public void addSuggestion(Suggestions suggestionsObject) throws Exception;
    public void editSuggestion(Suggestions suggestionsObject) throws Exception;
    public void lookupSuggestion(Suggestions suggestionsObject) throws Exception;
    public void deleteSuggestion(Suggestions suggestionsObject) throws Exception;
}
