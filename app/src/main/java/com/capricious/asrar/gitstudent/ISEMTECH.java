package com.capricious.asrar.gitstudent;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class ISEMTECH extends AppCompatActivity {

    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_s_e_m_t_e_c_h);
    }

    public void EADL (View view) {
        Intent startNewActivity = new Intent(this, EADActivity.class);
        startActivity(startNewActivity);
    }

    public void TimeTableISMTech(View view){
        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1-Pgl0scbhF9_dsUJXQ2JN1eZfy2BW3wj"); //https://www.gdirect.link/
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        Long reference = downloadManager.enqueue(request);
    }
    public void ScopyISMTech(View view){
        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1-VqlZ1qWoZUWvy7Vq4kVF2PZgX5OEMIv");
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        Long reference = downloadManager.enqueue(request);
    }
}