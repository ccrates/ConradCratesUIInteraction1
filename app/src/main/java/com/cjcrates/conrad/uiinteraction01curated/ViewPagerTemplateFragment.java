package com.cjcrates.conrad.uiinteraction01curated;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Conrad on 06/05/2017.
 */

public class ViewPagerTemplateFragment extends Fragment {

    private RelativeLayout view;
    private String header, body;
    private int image;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = (RelativeLayout)inflater.inflate(R.layout.fragment_view_pager_template, container, false);
        view.setClipChildren(false);
        view.setClipToPadding(false);
        initContent();
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RelativeLayout layout = (RelativeLayout) getView();
        layout.setClipChildren(false);
        layout.setClipToPadding(false);
    }

    private void initContent(){
        if(header != null){
            ((TextView)view.findViewById(R.id.text_header)).setText(header);
        }
        if (body != null) {
            ((TextView)view.findViewById(R.id.text_body)).setText(body);
        }
        if(image != 0){
            ((ImageView)view.findViewById(R.id.image_rotate)).setImageResource(image);
        }
    }

    public void setHeaderText(String text){
        header = text;
    }

    public void setBodyText(String text){
        body = text;
    }

    public void setImageView(int imageSrc){
        image = imageSrc;
    }
}