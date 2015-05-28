package com.cat.dialogplusdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import com.cat.dialogplusdemo.dialog_plus.DialogPlus;
import com.cat.dialogplusdemo.dialog_plus.ViewHolder;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private View contentView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contentView = View.inflate(getApplicationContext(), R.layout.content, null);
    }

    public void slideBottom(View view) {
        DialogPlus dialogPlus = new DialogPlus.Builder(this)
                .setContentHolder(new ViewHolder(contentView))
                .setFooter(R.layout.footer)
                .setHeader(R.layout.header)
//                .setOnClickListener(null)
//                .setOnBackPressListener(null)
//                .setOnCancelListener(null)
//                .setOnDismissListener(null)
//                .setOnItemClickListener(null)
                .create();

        View holderView = dialogPlus.getHolderView();
        TextView textView = (TextView) holderView.findViewById(R.id.title);
        textView.setText("test");

        View headerView = dialogPlus.getHeaderView();
        View footerView = dialogPlus.getFooterView();
        dialogPlus.show();
    }


}
