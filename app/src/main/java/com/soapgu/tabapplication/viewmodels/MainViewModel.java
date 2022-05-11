package com.soapgu.tabapplication.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

import com.soapgu.tabapplication.mvvm.ObservableViewModel;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainViewModel extends ObservableViewModel {
    private String title = "Hello Tab!";

    @Inject
    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.notifyPropertyChanged(BR.title);
    }
}
