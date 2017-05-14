package com.cjcrates.conrad.uiinteraction01curated;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by Conrad on 06/05/2017.
 */

public class RotateImageViewPagerTransformer implements ViewPager.PageTransformer {

    @Override
    public void transformPage(View page, float position) {
        page.setLayerType(View.LAYER_TYPE_NONE, null);

        View image = page.findViewById(R.id.image_rotate);

        image.setPivotX(image.getWidth());
        image.setPivotY(image.getHeight());

        image.setRotation(position * 90);
        image.setTranslationX(-position * page.getWidth());
    }
}
