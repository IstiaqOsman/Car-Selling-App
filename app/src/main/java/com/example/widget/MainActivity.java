package com.example.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Spanned;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mInactiveAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInactiveAmount = (TextView) findViewById(R.id.inactive_value);

        //SpannableString string = new SpannableString("Text with strikethrough span");
        //mInactiveAmount.setSpan(new StrikethroughSpan(), 10, 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mInactiveAmount.setPaintFlags(mInactiveAmount.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
    }
}