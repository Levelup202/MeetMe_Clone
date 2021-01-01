package com.example.meetme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Matches_Match extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvLocals;
    private TextView mTvLive;
    private TextView mTvChat;
    private TextView mTvMatch;
    private TextView mTvMe;
    private TextView mTvPlay_match;
    private TextView mTvAdmire_match;
    private TextView mTvMatches_match;
    private Button mBtnStartMatching_Matches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches__match);

        initViewsAndListeners_matches_match();
    }

    private void initViewsAndListeners_matches_match() {
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
        mTvPlay_match = findViewById(R.id.tvPlay_match);
        mTvPlay_match.setOnClickListener(this);
        mTvAdmire_match = findViewById(R.id.tvAdmire_match);
        mTvAdmire_match.setOnClickListener(this);
        mTvMatches_match = findViewById(R.id.tvMatches_match);
        mTvMatches_match.setOnClickListener(this);
        mBtnStartMatching_Matches = findViewById(R.id.btnStartMatching_Matches);
        mBtnStartMatching_Matches.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvLocals:
                Intent intentLocalActivity = new Intent(Matches_Match.this, LocalActivity.class);
                this.startActivity(intentLocalActivity);
                break;
            case R.id.tvLive:
                Intent intentLiveActivity = new Intent(Matches_Match.this, LiveActivity.class);
                this.startActivity(intentLiveActivity);
                break;
            case R.id.tvChat:
                Intent intentChatActivity = new Intent(Matches_Match.this, ChatActivity.class);
                this.startActivity(intentChatActivity);
                break;
            case R.id.tvPlay_match:
            case R.id.btnStartMatching_Matches:
                Intent intentPlay_matchActivity = new Intent(Matches_Match.this, MatchActivity.class);
                this.startActivity(intentPlay_matchActivity);
                break;
            case R.id.tvAdmire_match:
                Intent intentAdmire_matchActivity = new Intent(Matches_Match.this, Admire_Match.class);
                this.startActivity(intentAdmire_matchActivity);
                break;
            case R.id.tvMe:
                Intent intentMeActivity = new Intent(Matches_Match.this, MeActivity.class);
                this.startActivity(intentMeActivity);
                break;
        }
    }
}