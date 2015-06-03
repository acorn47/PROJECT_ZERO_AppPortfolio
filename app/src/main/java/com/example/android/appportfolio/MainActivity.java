package com.example.android.appportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openSpotify(View view) {
        makeDeliciousToast("Spotify Streamer");
    }

    public void openScores(View view) {
        makeDeliciousToast("Super Duo : Football Scores App");
    }

    public void openLibrary(View view) {
        makeDeliciousToast("Super Duo : Library App");
    }

    public void openBuild(View view) {
        makeDeliciousToast("Build It BIGGER");
    }

    public void openXYZ(View view) {
        makeDeliciousToast("XYZ Reader");
    }

    public void openCapstone(View view) {
        makeDeliciousToast("my capstone project");
    }

    private void makeDeliciousToast(String appName) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, "This button will launch " + appName, duration);
        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
        if( v != null) v.setGravity(Gravity.CENTER);
        toast.show();
    }
}
