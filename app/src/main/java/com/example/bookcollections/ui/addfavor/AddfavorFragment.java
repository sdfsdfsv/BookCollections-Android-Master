package com.example.bookcollections.ui.addfavor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.bookcollections.R;
import com.example.bookcollections.databinding.FragmentAddfavorBinding;


public class AddfavorFragment extends Fragment {

    private FragmentAddfavorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_addfavor, container, false);


        AddfavorViewModel addfavorViewModel = new ViewModelProvider(this).get(AddfavorViewModel.class);

        binding = FragmentAddfavorBinding.inflate(inflater, container, false);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}