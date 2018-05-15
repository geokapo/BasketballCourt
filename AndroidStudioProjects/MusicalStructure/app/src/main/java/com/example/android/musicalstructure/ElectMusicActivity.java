package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ElectMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


        // Creates an ArrayList of songs
        ArrayList<Song> songs = new ArrayList<Song>();
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
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);
    }

}


