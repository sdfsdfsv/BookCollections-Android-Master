package com.example.bookcollections.ui.addfavor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddfavorViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AddfavorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
