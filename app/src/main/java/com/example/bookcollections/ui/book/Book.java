package com.example.bookcollections.ui.book;


import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.bookcollections.R;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {


    public static List<Book> BookExamples= Arrays.asList(
            new Book("The Great Gatsby", "F. Scott Fitzgerald",  "https://wfqqreader-1252317822.image.myqcloud.com/cover/339/546339/t6_546339.jpg"),
            new Book("To Kill a Mockingbird", "Harper Lee","https://wfqqreader-1252317822.image.myqcloud.com/cover/339/546339/t6_546339.jpg"),
            new Book("1984", "George Orwell", "https://wfqqreader-1252317822.image.myqcloud.com/cover/339/546339/t6_546339.jpg"),
            new Book("Pride and Prejudice", "Jane Austen", "https://wfqqreader-1252317822.image.myqcloud.com/cover/339/546339/t6_546339.jpg"),
            new Book("The Catcher in the Rye", "J.D. Salinger", "https://wfqqreader-1252317822.image.myqcloud.com/cover/339/546339/t6_546339.jpg")
    );

    private String title;
    private String author;
    private String image;
    private String publishedDate;


    public Book(String title, String author, String image) {
        this.title = title;
        this.author = author;
        this.image = image;
        this.publishedDate = "1970/1/1";
    }

    public Book(String title, String author, String image, String publishedDate) {
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

    public String getImage() {
        return image;
    }

    public String getPublishedDate() {
        return publishedDate;
    }
}
