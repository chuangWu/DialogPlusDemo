package com.cat.dialogplusdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/**
 * Created by Administrator on 2015/6/10.
 */
public class PopupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_popup);
    }

    public void onRight(View view) {
        PopupWindow popupWindow = new PopupWindow(this);
        popupWindow.setWidth(WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setAnimationStyle(R.style.AnimationPreview);

        View contentView = View.inflate(this, R.layout.pop_top, null);
        popupWindow.setContentView(contentView);
        popupWindow.showAtLocation(view,Gravity.TOP,0,0);
    }
}
