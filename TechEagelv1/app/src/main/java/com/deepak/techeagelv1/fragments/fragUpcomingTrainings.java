package com.deepak.techeagelv1.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.deepak.techeagelv1.R;

/**
 * Created by Deepak Prasad on 25-12-2017.
 */

public class fragUpcomingTrainings extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_upcoming_trainings,container,false);

    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("TechEagle");

        TextView tv=(TextView)view.findViewById(R.id.upcomingTrainingTV);
        tv.setText("Hello...This is the Upcoming Training Tab");

    }
}
