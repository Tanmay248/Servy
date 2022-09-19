package com.example.servy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView cleaningCard;
    CardView plumberCard;
    CardView beautyCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cleaningCard = findViewById(R.id.card_view_Cleaning);
        plumberCard = findViewById(R.id.card_view_plumber);
        beautyCard = findViewById(R.id.card_view_beauty);


        cleaningCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent cleaningActivityIntent = new Intent(MainActivity.this, CleaningActivity.class);


                startActivity(cleaningActivityIntent);
            }
        });


        plumberCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent cleaningActivityIntent = new Intent(MainActivity.this, PlumberActivity.class);


                startActivity(cleaningActivityIntent);
            }
        });

        beautyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent beautyActivityIntent = new Intent(MainActivity.this, BeautyActivity.class);


                startActivity(beautyActivityIntent);
            }
        });


    }
}