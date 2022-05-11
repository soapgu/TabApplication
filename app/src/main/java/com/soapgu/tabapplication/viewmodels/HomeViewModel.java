package com.soapgu.tabapplication.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.Bindable;

import com.soapgu.tabapplication.BR;
import com.soapgu.tabapplication.mvvm.ObservableViewModel;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class HomeViewModel extends ObservableViewModel {

    private String homeText;

    @Inject
    public HomeViewModel(@NonNull Application application) {
        super(application);
    }

    @Bindable
    public String getHomeText() {
        return homeText;
    }

    public void setHomeText(String homeText) {
        this.homeText = homeText;
        this.notifyPropertyChanged(BR.homeText);
    }
}
