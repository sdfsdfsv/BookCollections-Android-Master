package com.example.bookcollections.ui.addfavor;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class AddfavorViewModel extends ViewModel {

    private MutableLiveData<String> query;

    public AddfavorViewModel() {
        query = new MutableLiveData<>();
        query.setValue("Enter your search query here");
    }

    public MutableLiveData<String> getText() {
        return query;
    }

    public void setText(String text) {
        query.setValue(text);
    }
}