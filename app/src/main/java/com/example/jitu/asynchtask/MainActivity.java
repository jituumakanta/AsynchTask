package com.example.jitu.asynchtask;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new DownloadFilesTask().execute("kkk");
    }

    private class DownloadFilesTask extends AsyncTask<String, Integer, Long> {


        @Override
        protected Long doInBackground(String... params) {
            return null;
        }
    }





}
