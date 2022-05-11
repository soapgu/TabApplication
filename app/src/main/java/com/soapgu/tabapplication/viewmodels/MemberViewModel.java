package com.soapgu.tabapplication.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.Bindable;

import com.soapgu.tabapplication.BR;
import com.soapgu.tabapplication.mvvm.ObservableViewModel;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MemberViewModel extends ObservableViewModel {

    private String memberText;

    @Inject
    public MemberViewModel(@NonNull Application application) {
        super(application);
    }

    @Bindable
    public String getMemberText() {
        return memberText;
    }

    public void setMemberText(String memberText) {
        this.memberText = memberText;
        this.notifyPropertyChanged(BR.memberText);
    }
}
