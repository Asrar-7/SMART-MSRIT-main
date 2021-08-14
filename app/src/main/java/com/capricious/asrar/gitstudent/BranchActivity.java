package com.capricious.asrar.gitstudent;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BranchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
    }
    public void CseEngg (View view){
        Intent startNewActivity = new Intent(this, SyllabusActivity.class);
        startActivity(startNewActivity);
    }

    public void IseEng (View view){
        Intent startNewActivity = new Intent(this, ISECourse.class);
        startActivity(startNewActivity);
    }
}
