package com.soapgu.tabapplication.fragments;

import android.content.ClipData;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.card_one).setOnLongClickListener( v -> {
            ClipData clipData = ClipData.newPlainText("number","1");
            v.startDragAndDrop(clipData,new View.DragShadowBuilder(v),null,0);
            return true;
        } );

        view.findViewById(R.id.card_two).setOnLongClickListener( v -> {
            ClipData clipData = ClipData.newPlainText("number","2");
            v.startDragAndDrop(clipData,new View.DragShadowBuilder(v),null,0);
            return true;
        } );

        view.findViewById(R.id.view_receive).setOnDragListener((v, event) -> {
            switch (event.getAction()){
                case DragEvent.ACTION_DROP:
                    ClipData clipData = event.getClipData();
                    String text = clipData.getItemAt(0).getText().toString();
                    Toast toast = Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT);
                    toast.show();
                    break;
            }
            return true;
        });
    }
}