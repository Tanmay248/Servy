package com.example.servy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BeautyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty);

        ListView cleaningList = findViewById(R.id.list_view_beauty);

        String[] service = {
                "Party Makeup",
                "HD Makeup",
                "Facial & cleanup",
                "Wax & Glow",
                "Glow Getter",
                "Pedicure",
                "Manicure",
                "Low contanct threading",
                "Hair care",
                "HairCut",
                "Chocolate waxing",
                "Honey waxing",
                "Full arms waxing",
                "Face & neck detan",
                "Hair care",
                "HairCut",
                "Chocolate waxing",
                "Honey waxing",
                "Full arms waxing",
                "Face & neck detan"
        };

        ArrayAdapter<String> beautyAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, service);

        cleaningList.setAdapter(beautyAdapter);
    }
}