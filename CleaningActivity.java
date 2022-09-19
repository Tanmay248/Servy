package com.example.servy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CleaningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning);

        ListView cleaningList = findViewById(R.id.list_view_cleaning);


        String[] service = {
                "Deep Cleaning",
                "Classic full Home Cleaning",
                "premium Full Home Cleaning",
                "Chimney Cleaning",
                "Basic Cleaning",
                "Bathroom Cleaning",
                "Microwave Cleaning",
                "Mattress Cleaning",
                "Kitchen Cleaning",
                "Balcony Cleaning",
                "Carpet Cleaning",
                "Bedroom Cleaning",
                "Refrigerator Cleaning",
                "Furnished Cleaning",
                "Kitchen Cleaning",
                "Balcony Cleaning",
                "Carpet Cleaning",
                "Bedroom Cleaning",
                "Refrigerator Cleaning",
                "Furnished Cleaning"
        };

        ArrayAdapter<String> cleaningAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, service);

        cleaningList.setAdapter(cleaningAdapter);
    }
}