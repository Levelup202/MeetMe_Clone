package com.example.meetme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NearBy_Live extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvLocals;
    private TextView mTvLive;
    private TextView mTvChat;
    private TextView mTvMatch;
    private TextView mTvMe;
    private TextView mTvTrending_live;
    private TextView mTvNearBy_live;
    private TextView mTvDate_live;
    private TextView mTvNew_live;
    private TextView mTvFavourites_live;
    private TextView mTvLeaderBoard_live;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_near_by__live);

        initViewsAndListeners_nearby_live();
    }

    private void initViewsAndListeners_nearby_live(){
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
        mTvTrending_live = findViewById(R.id.tvTrending_live);
        mTvTrending_live.setOnClickListener(this);
        mTvNearBy_live = findViewById(R.id.tvNearby_live);
        mTvNearBy_live.setOnClickListener(this);
        mTvDate_live = findViewById(R.id.tvDate_live);
        mTvDate_live.setOnClickListener(this);
        mTvNew_live = findViewById(R.id.tvNew_live);
        mTvNew_live.setOnClickListener(this);
        mTvFavourites_live = findViewById(R.id.tvFavourites_live);
        mTvFavourites_live.setOnClickListener(this);
        mTvLeaderBoard_live = findViewById(R.id.tvLeaderBoard_live);
        mTvLeaderBoard_live.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvLocals:
                Intent intentLocalActivity = new Intent(NearBy_Live.this, LocalActivity.class);
                this.startActivity(intentLocalActivity);
                break;
            case R.id.tvChat:
                Intent intentChatActivity = new Intent(NearBy_Live.this, ChatActivity.class);
                this.startActivity(intentChatActivity);
                break;
            case R.id.tvMatch:
                Intent intentMatchActivity = new Intent(NearBy_Live.this, MatchActivity.class);
                this.startActivity(intentMatchActivity);
                break;
            case R.id.tvTrending_live:
                Intent intentNearbyActivity = new Intent(NearBy_Live.this, LiveActivity.class);
                this.startActivity(intentNearbyActivity);
                break;
            case R.id.tvDate_live:
                Intent intentDateActivity = new Intent(NearBy_Live.this, Date_Live.class);
                this.startActivity(intentDateActivity);
                break;
            case R.id.tvNew_live:
                Intent intentNewActivity = new Intent(NearBy_Live.this, New_Live.class);
                this.startActivity(intentNewActivity);
                break;
            case R.id.tvFavourites_live:
                Intent intentFavouriteActivity = new Intent(NearBy_Live.this, Favourite_Live.class);
                this.startActivity(intentFavouriteActivity);
                break;
            case R.id.tvLeaderBoard_live:
                Intent intentLeaderBoardActivity = new Intent(NearBy_Live.this, LeaderBoard_Live.class);
                this.startActivity(intentLeaderBoardActivity);
                break;
            case R.id.tvMe:
                Intent intentMeActivity = new Intent(NearBy_Live.this, MeActivity.class);
                this.startActivity(intentMeActivity);
                break;
        }
    }
}