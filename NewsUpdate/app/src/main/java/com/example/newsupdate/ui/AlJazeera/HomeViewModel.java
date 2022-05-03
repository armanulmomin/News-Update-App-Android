package com.example.newsupdate.ui.AlJazeera;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Al Jazeera fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}