package com.capricious.asrar.gitstudent;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ISECourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_s_e_course);
    }
    public void MTech (View view){
        Intent startNewActivity = new Intent(this, ISEMTECH.class);
        startActivity(startNewActivity);
    }
}