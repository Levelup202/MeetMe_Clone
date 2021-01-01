package com.example.meetme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificationActivity extends AppCompatActivity {

    private Button mBtnPeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        mBtnPeople=findViewById(R.id.btnPeople);
        mBtnPeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent people=new Intent(NotificationActivity.this,LocalActivity.class);
                startActivity(people);
            }
        });
    }
}