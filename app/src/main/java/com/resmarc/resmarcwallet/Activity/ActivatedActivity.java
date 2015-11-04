package com.resmarc.resmarcwallet.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.resmarc.resmarcwallet.R;

/**
 * Created by Dulanga on 11/2/2015.
 */
public class ActivatedActivity extends Activity{

    private Button button;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activated_layout);

        button = (Button) findViewById(R.id.buttonShowCustomDialog);
        // add button listener
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent1 = new Intent(ActivatedActivity.this,HistoryActivity.class);
                startActivity(intent1);
                finish();
//                CustomAlertDialog c=new CustomAlertDialog(ActivatedActivity.this);
//                c.customAlertDialogMaker("Payed","This is test message",R.mipmap.paid_icon);
            }
        });
    }
}
