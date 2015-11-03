package com.resmarc.resmarcwallet.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.resmarc.resmarcwallet.R;

/**
 * Created by Dulanga on 11/3/2015.
 */
public class ListViewCustomAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] transaction;
    private final String[] transactionDate;
    private final String[] transactionPrice;

    public ListViewCustomAdapter(Context context, String[] transaction, String[] transactionDate, String[] transactionPrice) {
        super(context, -1, transaction);
        this.context = context;
        this.transaction=transaction;
        this.transactionDate=transactionDate;
        this.transactionPrice=transactionPrice;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_view_item_layout, parent, false);
        TextView textViewTransaction = (TextView) rowView.findViewById(R.id.firstLine);
        TextView textViewTransactionData = (TextView) rowView.findViewById(R.id.secondLine);
        TextView textViewTransactionPrice = (TextView) rowView.findViewById(R.id.price_tag);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        textViewTransaction.setText(transaction[position]);
        textViewTransactionData.setText(transactionDate[position]);
        textViewTransactionPrice.setText(transactionPrice[position]);
        // change the icon for Windows and iPhone
        String s = transaction[position];
        if (s.startsWith("Paid")) {
            imageView.setImageResource(R.mipmap.paid_icon);
        } else if(s.startsWith("Top-Up")){
            imageView.setImageResource(R.mipmap.topup_icon);
        }
        else if(s.startsWith("Updated")){
            imageView.setImageResource(R.mipmap.uptodate);
        }
        return rowView;
    }
}

