package com.example.bookcollections.ui.favorites;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;

import com.example.bookcollections.MainActivity;
import com.example.bookcollections.R;
import com.example.bookcollections.model.User;
import com.example.bookcollections.ui.addfavor.AddfavorActivity;
import com.example.bookcollections.ui.book.BookActivity;
import com.example.bookcollections.ui.book.BookAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;


public class FavoritesActivity extends MainActivity {

    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        LayoutInflater.from(this).inflate(R.layout.activity_books, findViewById(R.id.container), true);


        GridView gridView = findViewById(R.id.grid_view);

        // Create a book adapter to display the search results in the grid view
        BookAdapter bookAdapter = new BookAdapter(getApplicationContext(), User.getCurrentUser().GetFavorite());
        gridView.setAdapter(bookAdapter);



    }


}