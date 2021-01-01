package com.example.meetme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LocalActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mIvFilters;
    private TextView mTvLocals;
    private TextView mTvLive;
    private TextView mTvChat;
    private TextView mTvMatch;
    private TextView mTvMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_activity);

        initViewsAndListeners_local();
    }

    private void initViewsAndListeners_local() {
        mIvFilters = findViewById(R.id.ivFilters);
        mIvFilters.setOnClickListener(this);
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
            case R.id.ivFilters:
                Intent intentFilterActivity = new Intent(LocalActivity.this, LocalsFilterActivity.class);
                this.startActivity(intentFilterActivity);
                break;

            case R.id.tvLive:
                Intent intentLiveActivity = new Intent(LocalActivity.this, LiveActivity.class);
                this.startActivity(intentLiveActivity);
                break;
            case R.id.tvChat:
                Intent intentChatActivity = new Intent(LocalActivity.this, ChatActivity.class);
                this.startActivity(intentChatActivity);
                break;
            case R.id.tvMatch:
                Intent intentMatchActivity = new Intent(LocalActivity.this, MatchActivity.class);
                this.startActivity(intentMatchActivity);
                break;
            case R.id.tvMe:
                Intent intentMeActivity = new Intent(LocalActivity.this, MeActivity.class);
                this.startActivity(intentMeActivity);
                break;
        }
    }
}