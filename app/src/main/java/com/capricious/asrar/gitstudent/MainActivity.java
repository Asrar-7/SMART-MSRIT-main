package com.capricious.asrar.gitstudent;

import android.content.Intent;
import android.os.Bundle;
import com.onesignal.OneSignal;
import android.view.View;
//import android.support.design.widget.NavigationView;
import com.google.android.material.navigation.NavigationView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OneSignal.initWithContext(this);
        OneSignal.setAppId("00b0e716-b4bd-4357-a884-7ec53f3e1fbd");


       // OneSignal.startInit(this)
         //       .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
           //     .unsubscribeWhenNotificationsAreDisabled(true)
             //   .init();

        // Enable verbose OneSignal logging to debug issues if needed.

        //
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
      // OneSignal.setAppId(onesignal_app_id);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Email To Admin Feature Will Be Available Soon", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the e-Learning Resources
            startActivity(new Intent(this, BranchActivity.class));

            // Handles the continue or e-sutra
        } else if (id == R.id.nav_gallery) {
            startActivity(new Intent(this, CourseRegisterActivity.class));

            // Handles the MSRIT ISE
        }else if (id == R.id.nav_manage2) {
            startActivity(new Intent(this, TimeTableActivity.class));

            // Handles the MSRIT ISE
        } else if (id == R.id.nav_slideshow) {
            startActivity(new Intent(this, WebviewGit.class));

            // Handles the Logout Activity
        } else if (id == R.id.nav_manage) {
            startActivity(new Intent(this, ProfieActivity.class));

            // Handles the Feedback Activity
        } else if (id == R.id.nav_manage4) {
            startActivity(new Intent(this, ProfieActivity.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}
