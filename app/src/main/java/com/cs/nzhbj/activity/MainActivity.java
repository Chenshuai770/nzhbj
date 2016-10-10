package com.cs.nzhbj.activity;

import android.app.Activity;
import android.os.Bundle;

import com.cs.nzhbj.R;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* setBehindContentView(R.layout.left_menu);
        SlidingMenu slidingMenu=getSlidingMenu();
        slidingMenu.setMode(SlidingMenu.LEFT);
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        slidingMenu.setBehindOffset(200);*/



    }
}
