package com.noober.background.inflate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * view 实例化观察者，在{@link com.noober.background.BackgroundLibrary}中静态持有，注意内存泄漏
 */
public interface InflateObserver {

    <T extends View> T onViewInflated(Context context, String name, AttributeSet attrs);

}
