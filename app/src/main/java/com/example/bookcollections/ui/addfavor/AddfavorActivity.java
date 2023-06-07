package com.example.bookcollections.ui.addfavor;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bookcollections.MainActivity;
import com.example.bookcollections.R;
import com.example.bookcollections.ui.book.BookActivity;
import com.example.bookcollections.ui.favorites.FavoritesActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class AddfavorActivity extends MainActivity {

    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        LayoutInflater.from(this).inflate(R.layout.activity_addfavor, findViewById(R.id.container), true);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);

        // Initialize the search button
        Button searchButton = findViewById(R.id.search_button);
        Log.d(getLocalClassName(), this.toString());

        // Set an onClickListener to get the value of the input field and update the view model
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView searchInput = findViewById(R.id.search_input);
                String query = searchInput.getText().toString();

                if (!TextUtils.isEmpty(query)) {

                    Intent intent = new Intent(getApplicationContext(), BookActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("query", query);
                    intent.putExtras(bundle);
                    startActivity(intent);


                }
            }
        });


    }


}