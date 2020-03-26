package com.wishva.bubble_tab_bar_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.fxn.Bubble;

public class MainActivity extends AppCompatActivity
{

    private Bubble mHome,mClock,mFolder,mSettings;
    private TextView mOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHome = (Bubble)findViewById(R.id.main_home);
        mClock = (Bubble)findViewById(R.id.main_CLock);
        mFolder = (Bubble)findViewById(R.id.main_folder);
        mSettings = (Bubble)findViewById(R.id.main_barchart);
        mOutput = (TextView )findViewById(R.id.main_output);

        mHome.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                mOutput.setText("Home");
                return false;
            }
        });
        mClock.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                mOutput.setText("Clock");
                return false;
            }
        });
        mFolder.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                mOutput.setText("Documents");
                return false;
            }
        });
        mSettings.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                mOutput.setText("Settings");
                return false;
            }
        });

    }
}
