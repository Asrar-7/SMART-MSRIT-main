package com.capricious.asrar.gitstudent;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FourDBMS extends AppCompatActivity {
    DownloadManager downloadManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_dbms);
    }
    public void DBMSU11(View view){
        Intent startNewActivity = new Intent(this, DBMSU1.class);
        startActivity(startNewActivity);
    }

    public void DBMSU22(View view){
        Intent startNewActivity = new Intent(this, DBMSU2.class);
        startActivity(startNewActivity);
    }

    public void DBMSU33(View view){
        Intent startNewActivity = new Intent(this, DBMSU3.class);
        startActivity(startNewActivity);
    }

    public void DBMSU44(View view){
        Intent startNewActivity = new Intent(this, DBMSU4.class);
        startActivity(startNewActivity);
    }

    public void DBMSU55(View view){
        Intent startNewActivity = new Intent(this, DBMSU5.class);
        startActivity(startNewActivity);
    }
    public void IA1(View view){
        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse("https://docs.google.com/uc?export=download&id=1vJyfO60EccPGKnlZrwTHmHal0X_gnipv");
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        Long reference = downloadManager.enqueue(request);
    }

    public void IA2 (View view){
        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse("https://docs.google.com/uc?export=download&id=1JIcZbtCnW-KAEZ8u_lkgshnc22wLqBq9");
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        Long reference = downloadManager.enqueue(request);
    }

    public void IA3 (View view){
        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse("https://docs.google.com/uc?export=download&id=1tffPMhJtq97GQpKy1oKF8hJHPUysfG3K");
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        Long reference = downloadManager.enqueue(request);
    }

    public void AgFu (View view){
        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse("https://docs.google.com/uc?export=download&id=1xW-2z4mWA2KVg4HAThUp6zEPxZBlB9bg");
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        Long reference = downloadManager.enqueue(request);
    }
}
