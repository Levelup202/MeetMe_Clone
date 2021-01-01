package com.example.meetme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingActivity extends AppCompatActivity {

    private Button mBtnLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        mBtnLogOut=findViewById(R.id.btnLogOut);
        mBtnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logOut=new Intent(SettingActivity.this,LoginActivity.class);
                startActivity(logOut);
            }
        });
    }
}