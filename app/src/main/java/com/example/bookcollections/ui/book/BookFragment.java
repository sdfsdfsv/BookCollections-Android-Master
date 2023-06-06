package com.example.bookcollections.ui.book;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.bookcollections.R;

import java.util.ArrayList;
import java.util.List;


public class BookFragment extends Fragment {
    private GridView gridView;
    private BookAdapter bookAdapter;

    public static BookFragment setInstance(String query) {
        BookFragment bookFragment = new BookFragment();
        Bundle args = new Bundle();
        args.putString("query", query);
        bookFragment.setArguments(args);
        return bookFragment;
    }


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_books, container, false);
        gridView = root.findViewById(R.id.grid_view);

        try {


            String query = getArguments().getString("query");
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

        } catch (NullPointerException e) {

            bookAdapter = new BookAdapter(getContext(), Book.BookExamples);
            gridView.setAdapter(bookAdapter);
            return root;
        }

        // Filter the book examples based on the search query

    }
}