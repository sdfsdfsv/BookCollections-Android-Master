package com.example.bookcollections.ui.addfavor.searchResult;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.bookcollections.R;
import com.example.bookcollections.databinding.FragmentAddfavorBinding;
import com.example.bookcollections.ui.addfavor.searchResult.SearchResultFragment;
import com.example.bookcollections.ui.book.Book;
import com.example.bookcollections.ui.book.BookAdapter;

import android.widget.GridView;


import java.util.ArrayList;
import java.util.List;


public class SearchResultFragment extends Fragment {

    private GridView gridView;
    private BookAdapter bookAdapter;


    public static SearchResultFragment setInstance(String query) {
        SearchResultFragment bookFragment = new SearchResultFragment();
        Bundle args = new Bundle();
        args.putString("query", query);
        bookFragment.setArguments(args);
        return bookFragment;
    }


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_books, container, false);
        gridView = root.findViewById(R.id.grid_view);


        String query = getArguments().getString("query");

        // Filter the book examples based on the search query
        List<Book> searchResults = new ArrayList<>();
        for (Book book : Book.BookExamples) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase())) {
                searchResults.add(book);
            }
        }


        // Create a book adapter to display the search results in the grid view
        bookAdapter = new BookAdapter(getContext(), searchResults);
        gridView.setAdapter(bookAdapter);

        return root;
    }
}
