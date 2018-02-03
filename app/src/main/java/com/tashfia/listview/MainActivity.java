package com.tashfia.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String countryName[]={"Bangladesh","India","Pakistan","Australia","New Zeland","USA","UK","Bangladesh","India","Pakistan","Australia","New Zeland","USA","UK"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listview);
        ArrayAdapter adapter =new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,countryName);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent =new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("country",countryName[position]);
                startActivity(intent);
            }
        });


    }
}
