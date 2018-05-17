package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ElectMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


        // Creates an ArrayList of songs
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song ("Trippin", "Debris & Jonth"));
        songs.add (new Song ("More (feat. Philip Matta)", "Starlyte, SON & CHRSTN" ));
        songs.add(new Song ("Dance With Me","Sagan"));
        songs.add(new Song("Hold Me Back", "Marin Hoxha & Chris Linton "));
        songs.add(new Song (" Memento","Memento "));
        songs.add(new Song("Still Can't Sleep","Stoto "));
        songs.add(new Song("Game Of Thrones", "Mahmut Orhan"));
        songs.add(new Song("Simple World", "Marianto"));
        songs.add(new Song("Without You","Mahmut Orhan"));



        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.song_list);
        listView.setAdapter(adapter);


        /* Find the Home button*/
        Button homeButton = findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButton = new Intent(ElectMusicActivity.this, MainActivity.class);
                startActivity(homeButton);
            }
        });
    }


}


