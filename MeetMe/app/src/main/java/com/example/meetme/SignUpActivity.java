package com.example.meetme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvLoginWithFacebook;
    private TextView mTvAlreadyMember;
    private EditText mEtName;
    private EditText mEtEmail;
    private EditText mEtPassword;
    private EditText mEtBirthday;
    private EditText mEtGender;
    private EditText mEtLocation;
    private Button mBtnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initViewsAndListeners_SignUp();
    }

    private void initViewsAndListeners_SignUp(){
        mTvLoginWithFacebook = findViewById(R.id.tvFbLogin);
        mTvLoginWithFacebook.setOnClickListener(this);
        mTvAlreadyMember = findViewById(R.id.tvAlreadyMember);
        mTvAlreadyMember.setOnClickListener(this);
        mEtName = findViewById(R.id.etName_signup);
        mEtEmail = findViewById(R.id.etEmail_signUp);
        mEtPassword = findViewById(R.id.etPassword_signUp);
        mEtBirthday = findViewById(R.id.etBirthday_sighUp);
        mEtGender = findViewById(R.id.etGender_signUp);
        mEtLocation = findViewById(R.id.etLocation_signUp);
        mBtnSignUp = findViewById(R.id.btnSignUp);
        mBtnSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tvFbLogin:
                Toast.makeText(SignUpActivity.this, "This feature will available soon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tvAlreadyMember:
                Intent intentAlreadyMember = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intentAlreadyMember);
                break;
            case R.id.btnSignUp:
                Intent intentSignUp = new Intent(SignUpActivity.this, LoginActivity.class);
                intentSignUp.putExtra("email", mEtEmail.getText().toString());
                condition();
                if (condition() == true) {
                    startActivity(intentSignUp);
                } else {
                    Toast.makeText(SignUpActivity.this, "Enter Properly", Toast.LENGTH_SHORT).show();
                }
        }
    }

    private boolean condition() {
        boolean value = true;

        if (mEtName.getText().toString().length() < 6) {
            mEtName.setError("Username should be minimum 6 characters.");
            value = false;
        }
        if (mEtPassword.getText().toString().length() < 6) {
            mEtPassword.setError("Password should be minimum 7 characters in length.");
            value = false;
        }
        if (!mEtEmail.getText().toString().contains("@com") && !mEtEmail.getText().toString().contains(".com")){
            mEtEmail.setError("Invalid Email");
            value = false;
        }
        if (mEtBirthday.getText().toString().equals(null)){
            mEtBirthday.setError("Birthday should not be empty");
            value = false;
        }
        if (mEtGender.getText().toString().equals(null)){
            mEtGender.setError("Gender should not be empty");
            value = false;
        }
        if (mEtLocation.getText().toString().equals(null)){
            mEtLocation.setError("Location should not be empty");
            value = false;
        }

        return value;

    }

}