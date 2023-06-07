package com.example.bookcollections.model;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class User {



    private static final HashSet<Book> favorites = new HashSet<>();

    private static User currentUser;

    public User(){


        currentUser=this;

    }


    public static User getCurrentUser(){

        return currentUser;

    }


    public void AddFavorite(Book book){

        favorites.add(book);

    }

    public void DelFavorite(Book book){

        favorites.remove(book);

    }

    public void ClearFavorite(){

        favorites.clear();

    }

    public List<Book> GetFavorite(){

        return new ArrayList<>(favorites);
    }
}
