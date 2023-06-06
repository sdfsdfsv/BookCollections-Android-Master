package com.example.bookcollections.ui.addfavor;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.bookcollections.R;
import com.example.bookcollections.databinding.FragmentAddfavorBinding;
import com.example.bookcollections.ui.addfavor.searchResult.SearchResultFragment;
import com.google.android.material.textfield.TextInputEditText;


public class AddfavorFragment extends Fragment {

    protected FragmentAddfavorBinding binding;

    protected AddfavorViewModel addfavorViewModel;

    protected View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        addfavorViewModel = new ViewModelProvider(this).get(AddfavorViewModel.class);

        binding = FragmentAddfavorBinding.inflate(inflater, container, false);

        root = binding.getRoot();

        final TextView searchInput = binding.searchInput;

        // Initialize the search button

        Button searchButton = root.findViewById(R.id.search_button);

        // Set an onClickListener to get the value of the input field and update the view model
        searchButton.setOnClickListener(new SearchButton(root,searchInput) );


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}