package com.example.bookcollections.model;


import java.util.Arrays;
import java.util.List;

public class Book {


    public static List<Book> BookExamples = Arrays.asList(
            new Book("The Great Gatsby", "F. Scott Fitzgerald",
                    "https://bookcover.yuewen.com/qdbimg/349573/1022307607/180.webp", "1990/4"),
            new Book("To Kill a Mockingbird", "Harper Lee",
                    "https://bookcover.yuewen.com/qdbimg/349573/1021167823/150.webp", "1995/7"),
            new Book("1984", "George Orwell",
                    "https://bookcover.yuewen.com/qdbimg/349573/1020478246/150.webp", "1945/4"),
            new Book("Pride and Prejudice", "Jane Austen",
                    "https://bookcover.yuewen.com/qdbimg/349573/1033090158/150.webp", "1780/4"),
            new Book("The Catcher in the Rye", "J.D. Salinger",
                    "https://bookcover.yuewen.com/qdbimg/349573/1019103035/150.webp", "1980/5"),
            new Book("Animal Farm", "George Orwell",
                    "https://bookcover.yuewen.com/qdbimg/349573/1017149810/150.webp", "1945/8"),
            new Book("The Hobbit", "J.R.R. Tolkien",
                    "https://bookcover.yuewen.com/qdbimg/349573/1010734493/150.webp", "1937/9"),
            new Book("The Lord of the Rings", "J.R.R. Tolkien",
                    "https://bookcover.yuewen.com/qdbimg/349573/1010734494/150.webp", "1954/7"),
            new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling",
                    "https://bookcover.yuewen.com/qdbimg/349573/1014608738/150.webp", "1997/6"),
            new Book("The Da Vinci Code", "Dan Brown",
                    "https://bookcover.yuewen.com/qdbimg/349573/1017262686/150.webp", "2003/3"),
            new Book("The Alchemist", "Paulo Coelho",
                    "https://bookcover.yuewen.com/qdbimg/349573/1017149811/150.webp", "1988/4"),
            new Book("The Little Prince", "Antoine de Saint-Exupéry",
                    "https://bookcover.yuewen.com/qdbimg/349573/1022927845/150.webp", "1943/4"),
            new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams",
                    "https://bookcover.yuewen.com/qdbimg/349573/1019622651/150.webp", "1979/10"),
            new Book("The Hunger Games", "Suzanne Collins",
                    "https://bookcover.yuewen.com/qdbimg/349573/1014377452/150.webp", "2008/9"),
            new Book("The Girl with the Dragon Tattoo", "Stieg Larsson",
                    "https://bookcover.yuewen.com/qdbimg/349573/1014483563/150.webp", "2005/8")
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
