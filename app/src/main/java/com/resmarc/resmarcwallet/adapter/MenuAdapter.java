package com.resmarc.resmarcwallet.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by THARU on 11/3/2015.
 */
public class MenuAdapter extends ArrayAdapter<String> {

    public MenuAdapter(Context context, int resource, ArrayList<String> items) {
        super(context, resource, items);
    }

    @Override
    public int getCount() {
        return super.getCount()-1;
    }
}
