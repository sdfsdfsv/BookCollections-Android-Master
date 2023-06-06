package com.example.bookcollections.ui.book;

import android.graphics.drawable.Drawable;

public class Book {
    private String title;
    private String author;
    private Drawable image;
    private String publishedDate;


    public Book(String title, String author, Drawable image) {
        this.title = title;
        this.author = author;
        this.image = image;
        this.publishedDate = "1970/1/1";
    }

    public Book(String title, String author, Drawable image, String publishedDate) {
        this.title = title;
        this.author = author;
        this.image = image;
        this.publishedDate = publishedDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Drawable getImage() {
        return image;
    }

    public String getPublishedDate() {
        return publishedDate;
    }
}
