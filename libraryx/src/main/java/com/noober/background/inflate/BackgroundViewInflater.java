package com.noober.background.inflate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;

import com.noober.background.BackgroundLibrary;
import com.noober.background.view.BLButton;
import com.noober.background.view.BLCheckBox;
import com.noober.background.view.BLConstraintLayout;
import com.noober.background.view.BLEditText;
import com.noober.background.view.BLFrameLayout;
import com.noober.background.view.BLGridLayout;
import com.noober.background.view.BLGridView;
import com.noober.background.view.BLImageButton;
import com.noober.background.view.BLImageView;
import com.noober.background.view.BLLinearLayout;
import com.noober.background.view.BLListView;
import com.noober.background.view.BLProgressBar;
import com.noober.background.view.BLRadioButton;
import com.noober.background.view.BLRadioGroup;
import com.noober.background.view.BLRatingBar;
import com.noober.background.view.BLRelativeLayout;
import com.noober.background.view.BLScrollView;
import com.noober.background.view.BLSeekBar;
import com.noober.background.view.BLSpinner;
import com.noober.background.view.BLTextView;
import com.noober.background.view.BLToggleButton;

/**
 * 自定义ViewInflater
 */
public class BackgroundViewInflater extends AppCompatViewInflater {

    protected  <T extends View> T createBackgroundView(Context context, String name, AttributeSet attrs, View blView) {
        View view = BackgroundLibrary.getInflateObserver().onViewInflated(context, name, attrs);
        return (T) (null == view ? blView : view);
    }

    @NonNull
    @Override
    protected AppCompatTextView createTextView(Context context, AttributeSet attrs) {
        return createBackgroundView(context, TextView.class.getSimpleName(), attrs, new BLTextView(context, attrs));
    }

    @NonNull
    @Override
    protected AppCompatImageView createImageView(Context context, AttributeSet attrs) {
        return createBackgroundView(context, ImageView.class.getSimpleName(), attrs, new BLImageView(context, attrs));
    }

    @NonNull
    @Override
    protected AppCompatButton createButton(Context context, AttributeSet attrs) {
        return createBackgroundView(context, Button.class.getSimpleName(), attrs, new BLButton(context, attrs));
    }

    @NonNull
    @Override
    protected AppCompatEditText createEditText(Context context, AttributeSet attrs) {
        return createBackgroundView(context, EditText.class.getSimpleName(), attrs, new BLEditText(context, attrs));
    }

    @NonNull
    @Override
    protected AppCompatSpinner createSpinner(Context context, AttributeSet attrs) {
        return createBackgroundView(context, Spinner.class.getSimpleName(), attrs, new BLSpinner(context, attrs));
    }

    @NonNull
    @Override
    protected AppCompatImageButton createImageButton(Context context, AttributeSet attrs) {
        return createBackgroundView(context, ImageButton.class.getSimpleName(), attrs, new BLImageButton(context, attrs));
    }

    @NonNull
    @Override
    protected AppCompatCheckBox createCheckBox(Context context, AttributeSet attrs) {
        return createBackgroundView(context, CheckBox.class.getSimpleName(), attrs, new BLCheckBox(context, attrs));
    }

    @NonNull
    @Override
    protected AppCompatRadioButton createRadioButton(Context context, AttributeSet attrs) {
        return createBackgroundView(context, RadioButton.class.getSimpleName(), attrs, new BLRadioButton(context, attrs));
    }

    @NonNull
    @Override
    protected AppCompatCheckedTextView createCheckedTextView(Context context, AttributeSet attrs) {
        return super.createCheckedTextView(context, attrs);
    }

    @NonNull
    @Override
    protected AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context, AttributeSet attrs) {
        return super.createAutoCompleteTextView(context, attrs);
    }

    @NonNull
    @Override
    protected AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(Context context, AttributeSet attrs) {
        return super.createMultiAutoCompleteTextView(context, attrs);
    }

    @NonNull
    @Override
    protected AppCompatRatingBar createRatingBar(Context context, AttributeSet attrs) {
        return createBackgroundView(context, RatingBar.class.getSimpleName(), attrs, new BLRatingBar(context, attrs));
    }

    @NonNull
    @Override
    protected AppCompatSeekBar createSeekBar(Context context, AttributeSet attrs) {
        return createBackgroundView(context, SeekBar.class.getSimpleName(), attrs, new BLSeekBar(context, attrs));
    }

    @NonNull
    @Override
    protected AppCompatToggleButton createToggleButton(Context context, AttributeSet attrs) {
        return createBackgroundView(context, ToggleButton.class.getSimpleName(), attrs, new BLToggleButton(context, attrs));
    }

    @Nullable
    @Override
    protected View createView(Context context, String name, AttributeSet attrs) {
        View view = BackgroundLibrary.getInflateObserver().onViewInflated(context, name, attrs);
        if (null != view) {
            return view;
        }
        if ("androidx.constraintlayout.widget.ConstraintLayout".equals(name)) {
            return new BLConstraintLayout(context, attrs);
        } else if ("FrameLayout".equals(name)) {
            return new BLFrameLayout(context, attrs);
        } else if ("GridLayout".equals(name)) {
            return new BLGridLayout(context, attrs);
        } else if ("GridView".equals(name)) {
            return new BLGridView(context, attrs);
        } else if ("LinearLayout".equals(name)) {
            return new BLLinearLayout(context, attrs);
        } else if ("ListView".equals(name)) {
            return new BLListView(context, attrs);
        } else if ("RadioGroup".equals(name)) {
            return new BLRadioGroup(context, attrs);
        } else if ("RelativeLayout".equals(name)) {
            return new BLRelativeLayout(context, attrs);
        } else if ("ScrollView".equals(name)) {
            return new BLScrollView(context, attrs);
        } else if ("ProgressBar".equals(name)) {
            return new BLProgressBar(context, attrs);
        }
        return super.createView(context, name, attrs);
    }
}
