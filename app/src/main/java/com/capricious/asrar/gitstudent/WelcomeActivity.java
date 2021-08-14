package com.capricious.asrar.gitstudent;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void verificationPhone(View view){
        Intent startNewActivity = new Intent(this, MobVerification.class);
        startActivity(startNewActivity);
    }



    public void verificationEmail(View view){
        Intent startNewActivity = new Intent(this, LoginActivity.class);
        startActivity(startNewActivity);
    }
}
