package com.soapgu.tabapplication.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.soapgu.tabapplication.MemberFragment;
import com.soapgu.tabapplication.fragments.HomeFragment;
import com.soapgu.tabapplication.fragments.MutiLayoutFragment;

public class MyFragmentAdapter extends FragmentStateAdapter {

    public MyFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public MyFragmentAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public MyFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if( position == 0 ){
            return HomeFragment.newInstance();
        }
        else if( position == 1 ){
            return MutiLayoutFragment.newInstance();
        }
        return MemberFragment.newInstance();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
