package com.example.meetme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnAnyoneCanJoin;
    private Button mBtnLogin;
    private TextView mTvLoginWithFb;
    private TextView mTvSettings;
    private TextView mTvFeedback;
    private EditText mEtUserName;
    private EditText mEtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initClicksAndListenersLogin();
    }

    private void initClicksAndListenersLogin(){
        mBtnAnyoneCanJoin = findViewById(R.id.btnAnyoneCanJoin);
        mBtnAnyoneCanJoin.setOnClickListener(this);
        mBtnLogin = findViewById(R.id.btnLogin);
        mBtnLogin.setOnClickListener(this);
        mTvLoginWithFb = findViewById(R.id.tvLoginWithFb);
        mTvLoginWithFb.setOnClickListener(this);
        mTvSettings = findViewById(R.id.tvSettings);
        mTvSettings.setOnClickListener(this);
        mTvFeedback = findViewById(R.id.tvFeedback);
        mTvFeedback.setOnClickListener(this);
        mEtUserName = findViewById(R.id.etUsername);
        mEtPassword = findViewById(R.id.etPassword);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnLogin:
                Intent intentLogin = new Intent(LoginActivity.this, LocalActivity.class);
                condition();
                if (condition() == true) {
                    startActivity(intentLogin);
                } else {
                    Toast.makeText(LoginActivity.this, "Enter Properly", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnAnyoneCanJoin:
                Intent intentAnyoneCanJoin = new Intent(LoginActivity.this, SignUpActivity.class);
                this.startActivity(intentAnyoneCanJoin);
                break;
            case R.id.tvLoginWithFb:
            case R.id.tvSettings:
                Toast.makeText(LoginActivity.this, "This feature will available soon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvFeedback:
                Intent intentFeedback = new Intent();
                intentFeedback.setAction(Intent.ACTION_SEND);
                intentFeedback.putExtra(Intent.EXTRA_EMAIL, new String[]{"support@masaischool.com"});
                intentFeedback.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
                intentFeedback.setType("message/");
                startActivity(intentFeedback);
        }
    }

    private boolean condition() {
        boolean value = true;

        if (mEtUserName.getText().toString().length() < 6) {
            mEtUserName.setError("Username should be minimum 6 characters.");
            value = false;
        }
        if (mEtPassword.getText().toString().length() < 6) {
            mEtPassword.setError("Password should be minimum 7 characters in length.");
            value = false;
        }
        return value;

    }

}