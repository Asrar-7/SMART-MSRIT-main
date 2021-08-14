package com.capricious.asrar.gitstudent;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourCse extends AppCompatActivity {

    Button button4;
    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_cse);

    }
    public void DMST(View view){
        Intent startNewActivity = new Intent(this, FourDMS.class);
        startActivity(startNewActivity);
    }

    public void CIVT(View view){
        Intent startNewActivity = new Intent(this, FourCIV.class);
        startActivity(startNewActivity);
    }

    public void OPPSL(View view){
        Intent startNewActivity = new Intent(this, FourOPPSL.class);
        startActivity(startNewActivity);
    }

    public void OST(View view){
        Intent startNewActivity = new Intent(this, FourOS.class);
        startActivity(startNewActivity);
    }

    public void DAAL(View view){
        Intent startNewActivity = new Intent(this, FourDAAL.class);
        startActivity(startNewActivity);
    }

    public void DBMST(View view){
        Intent startNewActivity = new Intent(this, FourDBMS.class);
        startActivity(startNewActivity);
    }

    public void ECWL(View view){
        Intent startNewActivity = new Intent(this, FourECWL.class);
        startActivity(startNewActivity);
    }

    public void MMCL(View view){
        Intent startNewActivity = new Intent(this, FourMMCL.class);
        startActivity(startNewActivity);
    }

    public void DAAT(View view){
        Intent startNewActivity = new Intent(this, FourDAAT.class);
        startActivity(startNewActivity);
    }

    public void MMCT(View view){
        Intent startNewActivity = new Intent(this, FourMMCT.class);
        startActivity(startNewActivity);
    }
    public void TimeTable(View view){
        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse("https://docs.google.com/uc?export=download&id=1wuVGpCY2PN_0V8ownVGSvjboLqtdTLfc");
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        Long reference = downloadManager.enqueue(request);
    }
    public void Scopy(View view){
        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse("https://docs.google.com/uc?export=download&id=1IxDcRKtS26C-S6Vz81R8ridyp2Dqj18Q");
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        Long reference = downloadManager.enqueue(request);
    }

}
