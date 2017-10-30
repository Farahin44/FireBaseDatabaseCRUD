package com.example.acer.firebasedatabasecrud;
/**
 * Created by acer on 30/10/2017.
 */

public class Artist {
    String artistId;
    String artistName;

    public Artist (){}

    public Artist(String artisId, String artistName) {
        this.artistId = artisId;
        this.artistName = artistName;
    }

    public String getArtisId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }


}
