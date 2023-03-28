package com.noober.background.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

import com.noober.background.BackgroundFactory;

public class BLProgressBar extends ProgressBar {

    public BLProgressBar(Context context) {
        super(context);
    }

    public BLProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public BLProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    protected void init(Context context,AttributeSet attrs){
        BackgroundFactory.setViewBackground(context, attrs, this);
    }
}
