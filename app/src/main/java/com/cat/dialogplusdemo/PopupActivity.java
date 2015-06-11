package com.cat.dialogplusdemo;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;

/**
 * Created by Administrator on 2015/6/10.
 */
public class PopupActivity extends Activity {

    private Button mBtnFlag;
    private Button mHere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_popup);

        mBtnFlag  = (Button) findViewById(R.id.btn_flag);
        mHere  = (Button) findViewById(R.id.here);
    }

    public void onBottom(View view) {
        View menuView = View.inflate(this, R.layout.publish_dialog, null);
        PopupWindow popupWindow = new PopupWindow(this);
        popupWindow.setWidth(WindowManager.LayoutParams.MATCH_PARENT);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setContentView(menuView);
     //   PopupWindow popupWindow = new PopupWindow(menuView, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0xb0000000));
        popupWindow.setAnimationStyle(R.style.AnimBottom);
        popupWindow.showAtLocation(view, Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
    }

    public void onCenter(View view) {
        View menuView = View.inflate(this, R.layout.publish_dialog, null);
        PopupWindow popupWindow = new PopupWindow(menuView, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0xb0000000));
        popupWindow.setAnimationStyle(R.style.AnimCenter);
        popupWindow.showAtLocation(view, Gravity.CENTER , 0, 0);
    }

    public void onTop(View view) {
        View menuView = View.inflate(this, R.layout.publish_dialog, null);
        PopupWindow popupWindow = new PopupWindow(menuView, WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0xb0000000));
        popupWindow.setAnimationStyle(R.style.AnimTop);
        int[] location = new int[2];
        mBtnFlag.getLocationOnScreen(location);
        popupWindow.showAtLocation(mBtnFlag, Gravity.NO_GRAVITY, location[0], location[1]+mBtnFlag.getHeight());
    }

    public void onHere(View view){
        View menuView = View.inflate(this, R.layout.publish_dialog, null);
        PopupWindow popupWindow = new PopupWindow(menuView, mHere.getWidth(), WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0xb0000000));
        popupWindow.setAnimationStyle(R.style.AnimTop);
    //    int[] location = new int[2];
    //    mHere.getLocationOnScreen(location);
    //    popupWindow.showAtLocation(view, Gravity.NO_GRAVITY, location[0], location[1]+mHere.getHeight());
        popupWindow.showAsDropDown(mHere);
    }
}
