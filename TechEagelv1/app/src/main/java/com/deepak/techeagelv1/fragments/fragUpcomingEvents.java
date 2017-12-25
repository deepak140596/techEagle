package com.deepak.techeagelv1.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.deepak.techeagelv1.R;

/**
 * Created by Deepak Prasad on 25-12-2017.
 */

public class fragUpcomingEvents extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        return inflater.inflate(R.layout.fragment_upcoming_events, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Upcoming Events");
        ViewPager vp_pages= (ViewPager) view.findViewById(R.id.upcoming_events_vp_pages);
        PagerAdapter pagerAdapter=new FragmentAdapter(getChildFragmentManager());
        vp_pages.setAdapter(pagerAdapter);

        TabLayout tbl_pages= (TabLayout) view.findViewById(R.id.upcoming_events_tbl_pages);
        tbl_pages.setupWithViewPager(vp_pages);

    }

    class FragmentAdapter extends FragmentPagerAdapter {

        public FragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new fragUpcomingTrainings();
                case 1:
                    return new fragUpcomingWorkshops();

            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }


        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                //
                //Your tab titles
                //
                case 0:
                    return "Trainings";
                case 1:
                    return "Workshops";
                default:
                    return null;
            }


        }
    }
}
