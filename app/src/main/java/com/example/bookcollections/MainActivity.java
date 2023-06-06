package com.example.bookcollections;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.util.Log;


import com.example.bookcollections.databinding.ActivityMainBinding;
import com.example.bookcollections.model.User;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        Log.d(TAG, "Start creating ");

        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        new User();
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_addfavor, R.id.navigation_favorites, R.id.navigation_books)
                .build();
        Log.d(TAG, "onCreate: finished appbar config");

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        Log.d(TAG, "onCreate: find nav controller");

        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        Log.d(TAG, "onCreate: set up action bar");

        NavigationUI.setupWithNavController(binding.navView, navController);
        Log.d(TAG, "onCreate: set up nav controller");

        Log.d(TAG, "finished creating app");
    }

}