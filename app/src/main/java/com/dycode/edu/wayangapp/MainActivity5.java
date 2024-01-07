package com.dycode.edu.wayangapp;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        EditText searchEditText = findViewById(R.id.searchEditText);
        CardView searchCardView = findViewById(R.id.searchCardView);

        searchCardView.setRadius(50); 

        searchEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String searchText = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videokisahramayana1;
                Uri uri = Uri.parse(videoPath);

                VideoView videoView = findViewById(R.id.videoView);

                MediaController mediaController = new MediaController(MainActivity5.this);
                mediaController.setAnchorView(videoView);

                videoView.setVideoURI(uri);
                videoView.setMediaController(mediaController);

                videoView.start();
            }

            public void onwygbeberClick(View view) {
                Intent intent = new Intent(MainActivity5.this, MainActivity10.class);
                startActivity(intent);
            }
        });

    }
}