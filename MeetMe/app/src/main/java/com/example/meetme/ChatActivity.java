package com.example.meetme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvLocals;
    private TextView mTvLive;
    private TextView mTvChat;
    private TextView mTvMatch;
    private TextView mTvMe;
    private Button mBtnFindChatPartner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        initViewsAndListeners_chat();
    }

    private void initViewsAndListeners_chat() {
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
        mBtnFindChatPartner = findViewById(R.id.btnFindChatPartner);
        mBtnFindChatPartner.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvLocals:
            case R.id.btnFindChatPartner:
                Intent intentLocalActivity = new Intent(ChatActivity.this, LocalActivity.class);
                this.startActivity(intentLocalActivity);
                break;
            case R.id.tvLive:
                Intent intentLiveActivity = new Intent(ChatActivity.this, LiveActivity.class);
                this.startActivity(intentLiveActivity);
                break;
            case R.id.tvMatch:
                Intent intentMatchActivity = new Intent(ChatActivity.this, MatchActivity.class);
                this.startActivity(intentMatchActivity);
                break;
            case R.id.tvMe:
                Intent intentMeActivity = new Intent(ChatActivity.this, MeActivity.class);
                this.startActivity(intentMeActivity);
                break;
        }
    }
}