package com.google.firebase.codelab.friendlychat;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class events extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        viewPager =(ViewPager) findViewById(R.id.viewPager);


        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);
    }
}
