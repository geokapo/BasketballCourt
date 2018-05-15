package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PopMusicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


        // Creates an ArrayList of songs
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song ("One Kiss", "Calvin Harris, Dua Lipa"));
        songs.add (new Song ("In Common(Black Coffee Remix)", "Alicia Keys " ));
        songs.add(new Song (" I'm Sorry ","Arilena Ara"));
        songs.add(new Song("Wait", ""));
        songs.add(new Song("Never Be the Same", "Camila Cabello"));
        songs.add(new Song("No Tears Left To Cry","Ariana Grande"));
        songs.add(new Song("Thunder", "Imagine Dragons"));
        songs.add(new Song("How Long", "Charlie Puth"));
        songs.add(new Song("Wolves","Selena Gomez, Marshmell"));



        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.song_list);
        listView.setAdapter(adapter);
    }
}
