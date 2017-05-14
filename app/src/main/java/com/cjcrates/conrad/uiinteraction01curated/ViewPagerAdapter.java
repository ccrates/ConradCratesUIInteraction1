package com.cjcrates.conrad.uiinteraction01curated;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Conrad on 06/05/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private ArrayList<Fragment> frags = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fragManager, Context context){
        super(fragManager);
        this.context = context;
        initFragments();
    }

    private void initFragments(){
        ViewPagerTemplateFragment frag = new ViewPagerTemplateFragment();
        frag.setHeaderText(context.getString(R.string.header_text_1));
        frag.setBodyText(context.getString(R.string.body_text_1));
        frag.setImageView(R.drawable.camera_technology_display_items_resize_1_trans);
        frags.add(frag);

        frag = new ViewPagerTemplateFragment();
        frag.setHeaderText(context.getString(R.string.header_text_2));
        frag.setBodyText(context.getString(R.string.body_text_2));
        frag.setImageView(R.drawable.camera_technology_display_items_resize_2_trans);
        frags.add(frag);

        frag = new ViewPagerTemplateFragment();
        frag.setHeaderText(context.getString(R.string.header_text_3));
        frag.setBodyText(context.getString(R.string.body_text_3));
        frag.setImageView(R.drawable.camera_technology_display_items_resize_3_trans);
        frags.add(frag);
    }

    @Override
    public Fragment getItem(int position) {
        return frags.get(position);
    }

    @Override
    public int getCount() {
        return frags.size();
    }
}