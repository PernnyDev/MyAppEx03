package com.example.myappex03;

public class Book {
    private int imageResId;
    private String title;
    private String summary;

    public Book(int imageResId, String title, String summary) {
        this.imageResId = imageResId;
        this.title = title;
        this.summary = summary;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }
}
