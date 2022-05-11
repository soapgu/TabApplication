package com.soapgu.tabapplication;

import android.os.Bundle;

import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.soapgu.tabapplication.adapters.MyFragmentAdapter;
import com.soapgu.tabapplication.mvvm.MVVMActivity;
import com.soapgu.tabapplication.viewmodels.MainViewModel;

public class MainActivity extends MVVMActivity<MainViewModel> {
    ViewPager2 viewPager;

    public MainActivity() {
        super(MainViewModel.class, R.layout.activity_main, BR.dataContext);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyFragmentAdapter adapter = new MyFragmentAdapter(this);
        viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = this.findViewById(R.id.tab_layout);
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    String title = "";
                    switch (position){
                        case 0:
                            title = "本地控制";
                            break;
                        case 1:
                            title = "多画面控制";
                            break;
                        case 2:
                            title = "参会人员";
                            break;
                    }
                    tab.setText(title);
                }
        ).attach();

    }
}