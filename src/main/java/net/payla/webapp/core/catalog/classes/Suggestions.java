package net.payla.webapp.core.catalog.classes;

public class Suggestions {
    private String suggestionId;
    private String authorName;
    private String productName;
    private String context;
    private int rate;
    private boolean isEnabled;
    private boolean isViewable;
    private String response;

    public String getSuggestionId() {
        return suggestionId;
    }

    public void setSuggestionId(String suggestionId) {
        this.suggestionId = suggestionId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public boolean isViewable() {
        return isViewable;
    }

    public void setViewable(boolean viewable) {
        isViewable = viewable;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
