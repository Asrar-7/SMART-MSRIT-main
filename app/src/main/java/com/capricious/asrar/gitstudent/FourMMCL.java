package com.capricious.asrar.gitstudent;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FourMMCL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_mmcl);
    }

    public void MPLab(View view){
        Intent startNewActivity = new Intent(this, FourMP.class);
        startActivity(startNewActivity);
    }

    public void MCLab(View view){
        Intent startNewActivity = new Intent(this, FourMC.class);
        startActivity(startNewActivity);
    }

}
