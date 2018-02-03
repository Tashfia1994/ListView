package com.tashfia.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        textView =(TextView)findViewById(R.id.textView);
        String getName = getIntent().getExtras().getString("country");
        textView.setText(getName);
    }
}
