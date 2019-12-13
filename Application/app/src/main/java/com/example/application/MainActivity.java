package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.news_intent);
        btnMove.setOnClickListener(this);

        btnMove = findViewById(R.id.beratbadan);
        btnMove.setOnClickListener(this);

        btnMove = findViewById(R.id.penyakit);
        btnMove.setOnClickListener(this);

        btnMove = findViewById(R.id.tips);
        btnMove.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.news_intent:
                startActivity(new Intent(this, news.class));
                break;

            case R.id.beratbadan:
                startActivity(new Intent(this, Hitung.class));
                break;

            case R.id.penyakit:
                startActivity(new Intent(this, Penyakit.class));
                break;

            case R.id.tips:
                startActivity(new Intent(this, Tips.class));
                break;


        }
    }

}