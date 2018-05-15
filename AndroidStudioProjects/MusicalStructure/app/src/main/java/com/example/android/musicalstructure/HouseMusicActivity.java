package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class HouseMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


    // Creates an ArrayList of songs
    ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song ("Sunlight Denis First Club Remix", "Filatov & Karas"));
        songs.add (new Song ("Real You", "Vanze & Balco" ));
        songs.add(new Song ("Obsession feat. Steven Aderinto & DuoViolins","Consoul Trainin"));
        songs.add(new Song("Maria, Maria", "Mari Ferrari"));
        songs.add(new Song (" Crazy","Lost Frequencies & Zonderling "));
        songs.add(new Song("Cola","Camelphat & Elderbrook "));
        songs.add(new Song("Lost", "Roger Sanchez ft. Lisa Pur"));
        songs.add(new Song("Move On ft. Jabbar", "Deeperise"));
        songs.add(new Song("Thinking Of You","Elias"));
        songs.add(new Song("Bang Bang","Nancy Sinatra"));



    SongAdapter adapter = new SongAdapter(this, songs);
    ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);
}

}


