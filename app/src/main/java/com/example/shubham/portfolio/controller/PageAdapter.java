package com.example.shubham.portfolio.controller;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.shubham.portfolio.views.AboutFragment;
import com.example.shubham.portfolio.views.ContactFragment;
import com.example.shubham.portfolio.views.SkillFragment;
import com.example.shubham.portfolio.views.WorkFragment;

public class PageAdapter extends FragmentPagerAdapter {

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return  new AboutFragment();
            case 1: return  new ContactFragment();
            case 2: return  new SkillFragment();
            case 3: return  new WorkFragment();
            }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
          switch(position) {
              case 0: return "ABOUT";
              case 1: return "CONTACT";
              case 2: return "SKILL";
              case 3: return "WORK";
          }

        return null;
    }
}
