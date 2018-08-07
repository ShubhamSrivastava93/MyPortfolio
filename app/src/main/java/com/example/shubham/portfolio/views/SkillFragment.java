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


public class SkillFragment extends Fragment {


    public SkillFragment() {

    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View skillView= inflater.inflate(R.layout.fragment_skill, container, false);
        return skillView;
    }



}
