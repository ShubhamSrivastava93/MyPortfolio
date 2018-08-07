/*
 * Created by Shubham Srivastava (shubhamvns115@gmail.com)
 */
package com.example.shubham.portfolio.views;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shubham.portfolio.R;


public class WorkFragment extends Fragment {


    public WorkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View workView= inflater.inflate(R.layout.fragment_work, container, false);
        return workView;
    }


}
