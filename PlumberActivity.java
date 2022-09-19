package com.example.servy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PlumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plumber);

        ListView cleaningList = findViewById(R.id.list_view_plumber);

        String[] service = {
                "Basin & Sink",
                "Grouting",
                "Drainage",
                "Bath fitting",
                "Toilel",
                "Tap & mixer",
                "Water tank",
                "Motor",
                "Water pipe connections",
                "water filter",
                "washbasin installtion",
                "Bathroom tile gap filling",
                "Drain cover installation",
                "Drainage",
                "Bath fitting",
                "Toilel",
                "Tap & mixer",
                "Water tank",
                "Motor"
        };

        ArrayAdapter<String> plumberAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, service);

        cleaningList.setAdapter(plumberAdapter);
    }
}