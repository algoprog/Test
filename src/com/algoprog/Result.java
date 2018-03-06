package com.algoprog;

public class Result {
    private String href;
    private String title;
    private String summary;

    public Result(String href, String title, String summary) {
        this.href = href;
        this.title = title;
        this.summary = summary;
    }

    public String getHref() {
        return href;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    @Override
    public String toString() {
        return href + " : " + title + " : " + summary;
    }
}
