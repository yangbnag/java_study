package day17.collection.musicmanager.mo.vo;

import java.util.*;

public class Artist {

    private String ArtistName; // 가수이름

    List<String> musicTitle = new ArrayList<>(); // 노래제목

    public Artist(String key, String[] strings) {}

    public Artist(String artistName, List<String> musicTitle) {
        ArtistName = artistName;
        this.musicTitle = musicTitle;
    }

    public List<String> printTitle() {
        return musicTitle;
    }

    @Override
    public String toString() {
        return
                ArtistName + "님의 노래목록" + "\n" +
                "================================"
                        ;
    }
}
