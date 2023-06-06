package com.example.bookcollections.ui.addfavor;

import android.view.View;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.bookcollections.R;
import com.example.bookcollections.ui.addfavor.searchResult.SearchResultFragment;
import com.example.bookcollections.ui.book.Book;
import com.example.bookcollections.ui.book.BookFragment;


public class SearchButton implements View.OnClickListener {
    private View view;
    private TextView input;

    public SearchButton(View view, TextView input) {
        this.view = view;
        this.input = input;
    }

    @Override
    public void onClick(View v) {

        String query = input.getText().toString();

        if (!TextUtils.isEmpty(query)) {
            // Create a new instance of the search result fragment and pass the query as a parameter
            BookFragment searchResultFragment = new BookFragment();
            Bundle args = new Bundle();
            args.putString("query", query);
            searchResultFragment.setArguments(args);

            // Navigate to the new fragment
            NavController navController = Navigation.findNavController(view);
            navController.navigate(R.id.action_navigation_addfavor_to_searchResultFragment, args);
        }
    }
}

