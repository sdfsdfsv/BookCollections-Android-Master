package com.example.bookcollections;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;


import com.example.bookcollections.model.User;
import com.example.bookcollections.ui.addfavor.AddfavorActivity;
import com.example.bookcollections.ui.book.BookActivity;
import com.example.bookcollections.ui.favorites.FavoritesActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        new User();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_nav_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                int itemId = menuItem.getItemId();
                if (itemId == R.id.navigation_addfavor) {
                    Intent intent = new Intent(getApplicationContext(), AddfavorActivity.class);

                    startActivity(intent);

//                    new NavController(getApplicationContext()).navigate(R.id.navigation_books);
                    // Handle Home click

//                   bottomNavigationView.setSelectedItemId(R.id.navigation_addfavor);
                    return true;
                } else if (itemId == R.id.navigation_favorites) {

                    Intent intent = new Intent(getApplicationContext(), FavoritesActivity.class);

                    startActivity(intent);

//                    new NavController(getApplicationContext()).navigate(R.id.navigation_books);
                    // Handle Dashboard click

//                   bottomNavigationView.setSelectedItemId(R.id.navigation_favorites);
                    return true;
                } else if (itemId == R.id.navigation_books) {

                    Intent intent = new Intent(getApplicationContext(), BookActivity.class);

                    startActivity(intent);
                    // Handle Notifications click


//                    new NavController(getApplicationContext()).navigate(R.id.navigation_books);
                    // Your code goes here

//                   bottomNavigationView.setSelectedItemId(R.id.navigation_books);
                    return true;
                }
                return false;
            }
        });


    }

    protected void setNavigationVisibility(boolean visible) {
        bottomNavigationView.setVisibility(visible ? View.VISIBLE : View.GONE);
    }


}