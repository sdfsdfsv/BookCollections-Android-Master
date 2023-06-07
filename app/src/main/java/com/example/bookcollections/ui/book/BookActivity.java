package com.example.bookcollections.ui.book;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.bookcollections.MainActivity;
import com.example.bookcollections.R;
import com.example.bookcollections.model.Book;
import com.example.bookcollections.ui.addfavor.AddfavorActivity;
import com.example.bookcollections.ui.favorites.FavoritesActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;


public class BookActivity extends MainActivity {
    private GridView gridView;
    private BookAdapter bookAdapter;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

         LayoutInflater.from(this).inflate(R.layout.activity_books, findViewById(R.id.container), true);

 BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        bottomNavigationView.setSelectedItemId(R.id.navigation_addfavor);

        gridView = (GridView) findViewById(R.id.grid_view);

        String query = getIntent().getStringExtra("query");
        if (query != null && !query.isEmpty()) {
            // Filter the book examples based on the search query
            List<Book> searchResults = new ArrayList<>();
            for (Book book : Book.BookExamples) {
                if (book.getTitle().toLowerCase().contains(query.toLowerCase())) {
                    searchResults.add(book);
                }
            }
            // Create a book adapter to display the search results in the grid view
            bookAdapter = new BookAdapter(this, searchResults);
        } else {
            bookAdapter = new BookAdapter(this, Book.BookExamples);
        }
        gridView.setAdapter(bookAdapter);


    }

}
