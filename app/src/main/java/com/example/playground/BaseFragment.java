package com.example.playground;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;

public class BaseFragment extends Fragment {

    FrameLayout frameLayout;
    SlidingUpPanelLayout slidingUpPanelLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_base, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        frameLayout = getView().findViewById(R.id.fragment_frame_layout);
        slidingUpPanelLayout = getView().findViewById(R.id.sliding_up_panel_layout);
        getChildFragmentManager().beginTransaction().add(R.id.fragment_frame_layout, new ChildFragment()).commit();
        slidingUpPanelLayout.setPanelState(SlidingUpPanelLayout.PanelState.ANCHORED);
    }
}
