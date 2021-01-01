package com.example.meetme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MeActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvLocals;
    private TextView mTvLive;
    private TextView mTvChat;
    private TextView mTvMatch;
    private TextView mTvMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);

        initViewsAndListeners_Me();
    }

    private void initViewsAndListeners_Me() {
        mTvLocals = findViewById(R.id.tvLocals);
        mTvLocals.setOnClickListener(this);
        mTvLive = findViewById(R.id.tvLive);
        mTvLive.setOnClickListener(this);
        mTvChat = findViewById(R.id.tvChat);
        mTvChat.setOnClickListener(this);
        mTvMatch = findViewById(R.id.tvMatch);
        mTvMatch.setOnClickListener(this);
        mTvMe = findViewById(R.id.tvMe);
        mTvMe.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvLocals:
                Intent intentFilterActivity = new Intent(MeActivity.this, LocalActivity.class);
                this.startActivity(intentFilterActivity);
                break;

            case R.id.tvLive:
                Intent intentLiveActivity = new Intent(MeActivity.this, LiveActivity.class);
                this.startActivity(intentLiveActivity);
                break;
            case R.id.tvChat:
                Intent intentChatActivity = new Intent(MeActivity.this, ChatActivity.class);
                this.startActivity(intentChatActivity);
                break;
            case R.id.tvMatch:
                Intent intentMatchActivity = new Intent(MeActivity.this, MatchActivity.class);
                this.startActivity(intentMatchActivity);
                break;
        }
    }
}