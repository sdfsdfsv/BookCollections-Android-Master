package com.example.bookcollections.ui.favorites;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.bookcollections.R;
import com.example.bookcollections.databinding.FragmentFavoritesBinding;
import com.example.bookcollections.model.Book;
import com.example.bookcollections.model.User;
import com.example.bookcollections.ui.book.BookAdapter;

import java.util.ArrayList;

public class FavoritesFragment extends Fragment {

   public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_books, container, false);
        GridView gridView = root.findViewById(R.id.grid_view);

        // Create a book adapter to display the search results in the grid view
        BookAdapter bookAdapter = new BookAdapter(getContext(), User.getCurrentUser().GetFavorite());
        gridView.setAdapter(bookAdapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}