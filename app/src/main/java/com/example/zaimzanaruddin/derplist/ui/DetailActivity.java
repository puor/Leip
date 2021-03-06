package com.example.zaimzanaruddin.derplist.ui;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

import com.example.zaimzanaruddin.derplist.R;

public class DetailActivity extends AppCompatActivity {



    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_TITLE = "EXTRA_TITLE";
    private static final String EXTRA_LOC = "EXTRA_LOC";
    private static final String EXTRA_DES = "EXTRA_DES";
    private static final String EXTRA_TIME = "EXTRA_TIME";
    private static final String EXTRA_PIC = "EXTRA_PIC";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getBundleExtra(BUNDLE_EXTRAS);

       ((TextView)findViewById(R.id.lbl_quote_title)).setText(extras.getString(EXTRA_TITLE));
        ((TextView)findViewById(R.id.lbl_quote_loc)).setText(extras.getString(EXTRA_LOC));
        ((TextView)findViewById(R.id.lbl_quote_description)).setText(extras.getString(EXTRA_DES));
        ((TextView)findViewById(R.id.lbl_quote_time)).setText(extras.getString(EXTRA_TIME));
        ((ImageView)findViewById(R.id.im_event_icon)).setImageURI(Uri.parse(extras.getString(EXTRA_PIC)));

    }
}
