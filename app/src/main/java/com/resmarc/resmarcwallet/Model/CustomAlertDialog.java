package com.resmarc.resmarcwallet.Model;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.resmarc.resmarcwallet.R;

/**
 * Created by Dulanga on 11/3/2015.
 */
public class CustomAlertDialog {

    private Activity activity;
    private Dialog mDialog;
    private LinearLayout lLMain;

    public CustomAlertDialog(Activity activity) {
        this.activity = activity;
    }

    /**
     * Custom alert dialog box generate method
     * @param title     title of the alert dialog box
     * @param body      message body
     * @param srcImage  relevant icon of the alert dialog box
     */
    public void customAlertDialogMaker(String title,String body,int srcImage) {
        if (activity != null) {
            mDialog = new Dialog(activity, R.style.Dialog_No_Border);
            mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

            LinearLayout m_inflater = null;
            View m_view = m_inflater.inflate(activity, R.layout.custom_dialog_layout, null);
            lLMain = (LinearLayout) m_view.findViewById(R.id.cadllMain);

            lLMain.setBackgroundResource(R.drawable.custom_alert_dialog_round_corner);
            TextView textViewBody, textViewTitle;
            ImageView titleImage;
            titleImage = (ImageView) m_view.findViewById(R.id.title_image);
            textViewTitle = (TextView) m_view.findViewById(R.id.title);
            textViewBody = (TextView) m_view.findViewById(R.id.body);
            titleImage.setImageResource(srcImage);
            textViewTitle.setTextColor(Color.parseColor("#00bdbd"));
            textViewTitle.setText(title);
            textViewBody.setText(body);

            Button m_btnOk = (Button) m_view.findViewById(R.id.cadbtnOk);
            View.OnClickListener m_clickListener = new View.OnClickListener() {
                @Override
                public void onClick(View p_v) {
                    switch (p_v.getId()) {
                        case R.id.cadbtnOk:
                            mDialog.dismiss();
                            break;
                        default:
                            break;
                    }
                }
            };
            m_btnOk.setOnClickListener(m_clickListener);
            mDialog.setContentView(m_view);
            if (!activity.isFinishing()) {
                mDialog.show();
            }

        }

    }
}
