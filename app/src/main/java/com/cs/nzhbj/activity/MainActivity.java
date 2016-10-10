package com.cs.nzhbj.activity;

import android.os.Bundle;

import com.cs.nzhbj.R;
import com.cs.nzhbj.fragment.ContentFragment;
import com.cs.nzhbj.fragment.LeftMenuFragment;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

/**
 * fragment需要被替换
 */

public class MainActivity extends SlidingFragmentActivity {
    private static final String FRAGMENT_LEFT_MENU = "fragment_left_menu";
    private static final String FRAGMENT_CONTENT = "fragment_content";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBehindContentView(R.layout.activity_leftmenu);
        SlidingMenu slidingMenu = getSlidingMenu();
        slidingMenu.setMode(SlidingMenu.LEFT);
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        slidingMenu.setBehindOffset(200);
        initFragment();

    }

    private void initFragment() {
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        // 开启事务
        android.support.v4.app.FragmentTransaction transaction = fm.beginTransaction();

        // 用fragment替换framelayout【参数：将 new LeftMenuFragment()放在（替换）R.id.fl_left_menu里面，
        // 第三个参数视为该替换的标记，可用标记取得对象】
        transaction.replace(R.id.fl_content, new ContentFragment(),FRAGMENT_CONTENT);
        transaction.replace(R.id.fl_leftmenu,new LeftMenuFragment(),FRAGMENT_LEFT_MENU);
        // 提交事务
        transaction.commit();
        // 通过标记取得对象
        // Fragment leftMenuFragment = fm.findFragmentByTag(FRAGMENT_LEFT_MENU);
    }

}
