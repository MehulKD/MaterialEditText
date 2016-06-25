package com.rengwuxian.materialedittext.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.rengwuxian.materialedittext.MaterialEditText;

public class MainActivity extends AppCompatActivity {

    MaterialEditText mEditText;
    private boolean mShowPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initView();
    }

    private void initView() {
        mEditText = (MaterialEditText) findViewById(R.id.et_text);
        mEditText.setInnerRightIconClickListener(new MaterialEditText.InnerRightIconClickListener() {
            @Override
            public void click() {
                if (mShowPassword) {
                    mEditText.setInnerIconRight(R.drawable.ic_launcher);
                } else {
                    mEditText.setInnerIconRight(R.drawable.ic_phone);
                }
                mShowPassword = !mShowPassword;
            }
        });
    }
}
