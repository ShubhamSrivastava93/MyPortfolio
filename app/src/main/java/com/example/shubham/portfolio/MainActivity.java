package com.example.shubham.portfolio;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.shubham.portfolio.controller.PageAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager= findViewById(R.id.viewPage);
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager()));
        tabLayout= findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabTextColors(Color.BLACK,Color.WHITE);
    }
}
