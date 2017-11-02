package com.example.toshiba.firebasedatabasetest1;

/**
 * Created by Toshiba on 02/11/2017.
 */

public class Artist {
    String artistId;
    String artistName;
    String artistGenre;

    public Artist(String artistId, String artistName, String artistGenre) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
    }

    public Artist() {

    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistGenre() {
        return artistGenre;
    }
}
