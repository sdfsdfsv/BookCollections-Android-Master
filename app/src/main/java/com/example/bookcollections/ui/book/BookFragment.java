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

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_books, container, false);
        gridView = root.findViewById(R.id.grid_view);

        // Create a list of books
        // Create a list of books
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", ContextCompat.getDrawable(getContext(), R.drawable.book)));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", ContextCompat.getDrawable(getContext(), R.drawable.book)));
        books.add(new Book("1984", "George Orwell", ContextCompat.getDrawable(getContext(), R.drawable.book)));
        books.add(new Book("Pride and Prejudice", "Jane Austen", ContextCompat.getDrawable(getContext(), R.drawable.book)));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", ContextCompat.getDrawable(getContext(), R.drawable.book)));

// Create a book adapter to display the book images in the grid view
        bookAdapter = new BookAdapter(getContext(), books);
        gridView.setAdapter(bookAdapter);

        return root;
    }
}