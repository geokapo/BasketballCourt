package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> androidSongs) {
        super(context,0,androidSongs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Song currentSong = getItem(position);

        final TextView songName = (TextView) listItemView.findViewById(R.id.song_name);
        songName.setText(currentSong.getSongName());

        final TextView artistName = (TextView) listItemView.findViewById(R.id.artist_name);
        artistName.setText(currentSong.getArtistName());

        return listItemView;

        /* Setting OnClickListener on the list view items */
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), CurrentSong.class);
                i.putExtra("songName", currentSong.getSongName());
                i.putExtra("artistName", (currentSong.getSongName());
                getContext().startActivity(i);
            }
        });


    }


}
