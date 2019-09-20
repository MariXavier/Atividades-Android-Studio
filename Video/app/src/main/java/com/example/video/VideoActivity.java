package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity
{
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView = findViewById(R.id.videoView);
        View decorView = getWindow().getDecorView();

        int opcoesDeInterface = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(opcoesDeInterface);

        getSupportActionBar().hide();

        videoView.setMediaController(new MediaController(this));

        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.friends);
        videoView.start();
    }
}
