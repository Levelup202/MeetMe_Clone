package com.example.meetme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FavoriteActivity extends AppCompatActivity {

    private Button mBtnLive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        mBtnLive=findViewById(R.id.btnLive);
        mBtnLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent live=new Intent(FavoriteActivity.this,LiveActivity.class);
                startActivity(live);
            }
        });
    }
}