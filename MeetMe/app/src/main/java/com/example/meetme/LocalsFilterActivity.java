package com.example.meetme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LocalsFilterActivity extends AppCompatActivity {

    private ImageView mIvBackArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locals_filter);

        mIvBackArrow = findViewById(R.id.ivBackArrow);

        mIvBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBackArrow = new Intent(LocalsFilterActivity.this, LocalActivity.class);
                startActivity(intentBackArrow);
            }
        });
    }
}