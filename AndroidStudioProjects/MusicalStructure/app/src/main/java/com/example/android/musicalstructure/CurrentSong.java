package com.example.android.musicalstructure;

public class CurrentSong {
    private String mSongName;
    private String mArtistName;

    public CurrentSong(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }
}


