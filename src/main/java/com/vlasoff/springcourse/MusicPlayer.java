package com.vlasoff.springcourse;

import java.util.List;

public class MusicPlayer {
    private final List<Music> musicList;

    private String name;

    private int volume;

    //IoC

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println(music.getSong());
        }
    }
}
