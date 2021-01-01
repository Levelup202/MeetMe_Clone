package com.example.meetme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FriendsActivity extends AppCompatActivity {

    private Button mBtnMeet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);
        mBtnMeet=findViewById(R.id.btnMeet);
        mBtnMeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent meet=new Intent(FriendsActivity.this,LocalActivity.class);
                startActivity(meet);
            }
        });
    }
}