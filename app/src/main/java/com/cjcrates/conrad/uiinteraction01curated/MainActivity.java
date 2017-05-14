package com.cjcrates.conrad.uiinteraction01curated;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = (ViewPager)findViewById(R.id.viewPager);

        pager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), this));
        pager.setPageTransformer(true, new RotateImageViewPagerTransformer());

        pager.setClipChildren(false);
        pager.setClipToPadding(false);
        pager.setOffscreenPageLimit(2);
    }
}