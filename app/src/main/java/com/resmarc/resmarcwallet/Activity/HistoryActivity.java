package com.resmarc.resmarcwallet.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.resmarc.resmarcwallet.Adapters.ListViewCustomAdapter;
import com.resmarc.resmarcwallet.R;

/**
 * Created by DELL on 11/3/2015.
 */
public class HistoryActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_activity_layout);

        String[] transaction = new String[] { "Paid", "Paid", "Updated",
                "Paid", "Updated", "Paid", "Top-Up", "Paid",
                "Updated", "Paid" };
        String[] transactionDate = new String[] { "3/11/2015", "4/11/2015", "5/11/2015",
                "6/11/2015", "7/11/2015", "8/11/2015", "9/11/2015", "10/11/2015",
                "11/11/2015", "12/11/2015" };
        String[] transactionPrice = new String[] { "90.00", "80.00", "30.00",
                "20.00", "10.00", "5.00", "200.00", "50.00",
                "155.00", "50.00" };
        ListViewCustomAdapter adapter = new ListViewCustomAdapter(this, transaction,transactionDate,transactionPrice);
        ListView listView =(ListView)findViewById(R.id.history_list);
        listView.setAdapter(adapter);
    }

}
