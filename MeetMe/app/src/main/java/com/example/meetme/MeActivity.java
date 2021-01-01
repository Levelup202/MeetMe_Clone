package com.example.meetme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class MeActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvLocals;
    private TextView mTvLive;
    private TextView mTvChat;
    private TextView mTvMatch;
    private TextView mTvMe;
    private TextView mTvVerify;
    private TextView mTvMeetMee;
    private TextView mTvNotify;
    private TextView mTvViews;
    private TextView mTvFavorite;
    private TextView mTvFriends;
    private TextView mTvLevels;
    private TextView mTvCredits;
    private TextView mTvDiamond;
    private TextView mTvSettings;
    private CircleImageView mCircleImageView;
    private ImageView mImagePicOne;

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
        mTvVerify = findViewById(R.id.tvVerifyNow);
        mTvVerify.setOnClickListener(this);
        mTvMeetMee = findViewById(R.id.tvMeetMe);
        mTvMeetMee.setOnClickListener(this);
        mTvNotify = findViewById(R.id.tvNotification);
        mTvNotify.setOnClickListener(this);
        mTvViews = findViewById(R.id.tvViews);
        mTvViews.setOnClickListener(this);
        mTvFavorite = findViewById(R.id.tvFavourites);
        mTvFavorite.setOnClickListener(this);
        mTvFriends = findViewById(R.id.tvFriends);
        mTvFriends.setOnClickListener(this);
        mTvLevels = findViewById(R.id.tvLevel);
        mTvLevels.setOnClickListener(this);
        mTvCredits = findViewById(R.id.tvCredits);
        mTvCredits.setOnClickListener(this);
        mTvDiamond = findViewById(R.id.tvDiamonds);
        mTvDiamond.setOnClickListener(this);
        mTvSettings = findViewById(R.id.tvSettings);
        mTvSettings.setOnClickListener(this);
        mCircleImageView = findViewById(R.id.circleImageView);
        mCircleImageView.setOnClickListener(this);
        mImagePicOne = findViewById(R.id.imagePicOne);
        mImagePicOne.setOnClickListener(this);
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
            case R.id.tvVerifyNow:
                Intent verify = new Intent(MeActivity.this, PicVerifyNowActivity.class);
                this.startActivity(verify);
                break;
            case R.id.tvMeetMe:
                Intent meetMe = new Intent(MeActivity.this, MeetMePlusActivity.class);
                this.startActivity(meetMe);
                break;
            case R.id.tvNotification:
                Intent notify = new Intent(MeActivity.this, NotificationActivity.class);
                this.startActivity(notify);
                break;
            case R.id.tvViews:
                Intent views = new Intent(MeActivity.this, ViewsActivity.class);
                this.startActivity(views);
                break;
            case R.id.tvFavourites:
                Intent favorite = new Intent(MeActivity.this, FavoriteActivity.class);
                this.startActivity(favorite);
                break;
            case R.id.tvFriends:
                Intent friends = new Intent(MeActivity.this, FriendsActivity.class);
                this.startActivity(friends);
                break;
            case R.id.tvLevel:
                Intent level = new Intent(MeActivity.this, LevelsActivity.class);
                this.startActivity(level);
                break;
            case R.id.tvCredits:
                Intent credits = new Intent(MeActivity.this, CreditActivity.class);
                this.startActivity(credits);
                break;
            case R.id.tvDiamonds:
                Intent diamond = new Intent(MeActivity.this, DiamondActivity.class);
                this.startActivity(diamond);
                break;
            case R.id.tvSettings:
                Intent settings = new Intent(MeActivity.this, SettingActivity.class);
                this.startActivity(settings);
                break;
            case R.id.circleImageView:
            case R.id.imagePicOne:
                Intent image = new Intent(MeActivity.this, ProfileActivity.class);
                this.startActivity(image);
                break;
        }
    }
}