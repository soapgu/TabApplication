package com.soapgu.tabapplication.fragments;

import android.os.Bundle;

import androidx.databinding.library.baseAdapters.BR;
import androidx.fragment.app.Fragment;

import com.soapgu.tabapplication.R;
import com.soapgu.tabapplication.mvvm.MVVMFragment;
import com.soapgu.tabapplication.viewmodels.HomeViewModel;

import dagger.hilt.android.AndroidEntryPoint;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
@AndroidEntryPoint
public class HomeFragment extends MVVMFragment<HomeViewModel> {

    public HomeFragment() {
        super(HomeViewModel.class,R.layout.fragment_home, BR.dataContext);
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment HomeFragment.
     */
    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}