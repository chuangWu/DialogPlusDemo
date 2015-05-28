package com.cat.dialogplusdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.cat.dialogplusdemo.dialog_plus.DialogPlus;
import com.cat.dialogplusdemo.dialog_plus.GridHolder;
import com.cat.dialogplusdemo.dialog_plus.ListHolder;
import com.cat.dialogplusdemo.dialog_plus.OnItemClickListener;
import com.cat.dialogplusdemo.dialog_plus.ViewHolder;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private View contentView;
    SimpleAdapter listAdapter ;
    SimpleAdapter gridAdaper ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contentView = View.inflate(getApplicationContext(), R.layout.content, null);
        contentView = View.inflate(getApplicationContext(), R.layout.content, null);
        listAdapter = new SimpleAdapter(MainActivity.this, false);
        gridAdaper = new SimpleAdapter(MainActivity.this, true);
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

    public void slideTop(View view) {
        DialogPlus dialogPlus = new DialogPlus.Builder(this)
                .setContentHolder(new ViewHolder(contentView))
                .setFooter(R.layout.footer)
                .setHeader(R.layout.header)
                .setGravity(DialogPlus.Gravity.TOP)
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

    public void slideCenter(View view){
        DialogPlus dialogPlus = new DialogPlus.Builder(this)
                .setContentHolder(new ViewHolder(contentView))
                .setFooter(R.layout.footer)
                .setHeader(R.layout.header)
                .setGravity(DialogPlus.Gravity.CENTER)
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

    public void bottomListView(View view){
        DialogPlus dialogPlus = new DialogPlus.Builder(this)
                .setContentHolder(new ListHolder())
                .setAdapter(listAdapter)
               .setOnItemClickListener(new OnItemClickListener() {
                   @Override
                   public void onItemClick(DialogPlus dialog, Object item, View view, int position) {

                   }
               })
                .create();

        dialogPlus.show();
    }

    public void centerListView(View view){
        DialogPlus dialogPlus = new DialogPlus.Builder(this)
                .setContentHolder(new ListHolder())
                .setAdapter(listAdapter)
                .setGravity(DialogPlus.Gravity.CENTER)
                .setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(DialogPlus dialog, Object item, View view, int position) {
                        Toast.makeText(getApplicationContext(), position + "", 0).show();
                    }
                })
                .create();

        dialogPlus.show();
    }
    public void topListView(View view){
        DialogPlus dialogPlus = new DialogPlus.Builder(this)
                .setContentHolder(new ListHolder())
                .setAdapter(listAdapter)
                .setGravity(DialogPlus.Gravity.TOP)
                .setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(DialogPlus dialog, Object item, View view, int position) {
                        Toast.makeText(getApplicationContext(), position + "", 0).show();
                    }
                })
                .create();

        dialogPlus.show();
    }

    public void bottomGridView(View view){
        DialogPlus dialogPlus = new DialogPlus.Builder(this)
                .setContentHolder(new GridHolder(3))
                .setAdapter(gridAdaper)
                .setGravity(DialogPlus.Gravity.BOTTOM)
                .setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(DialogPlus dialog, Object item, View view, int position) {
                        Toast.makeText(getApplicationContext(), position + "", 0).show();
                    }
                })
                .create();

        dialogPlus.show();
    }
    public void centerGridView(View view){
        DialogPlus dialogPlus = new DialogPlus.Builder(this)
                .setContentHolder(new GridHolder(3))
                .setAdapter(gridAdaper)
                .setGravity(DialogPlus.Gravity.CENTER)
                .setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(DialogPlus dialog, Object item, View view, int position) {
                        Toast.makeText(getApplicationContext(), position + "", 0).show();
                    }
                })
                .create();

        dialogPlus.show();
    }
    public void topGridView(View view){
        DialogPlus dialogPlus = new DialogPlus.Builder(this)
                .setContentHolder(new GridHolder(2))
                .setAdapter(gridAdaper)
                .setGravity(DialogPlus.Gravity.TOP)
                .setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(DialogPlus dialog, Object item, View view, int position) {
                        Toast.makeText(getApplicationContext(), position + "", 0).show();
                    }
                })
                .create();

        dialogPlus.show();
    }
}
