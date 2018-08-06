package com.example.shubham.portfolio.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shubham.portfolio.R;

public class ContactFragment extends Fragment {



    public ContactFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View contactView = inflater.inflate(R.layout.fragment_contact, container, false);
        return contactView;
    }



}
