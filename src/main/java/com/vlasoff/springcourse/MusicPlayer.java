package com.vlasoff.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> genres;

    private Random random;

    public MusicPlayer(List<Music> genres) {
        this.genres = genres;
        this.random = new Random();
    }

    public String playMusic() {
        int i = random.nextInt(0, genres.size());
        Music music = genres.get(i);
        return play(music);
    }

    private String play(Music music) {
        List<String> songs = music.getSongs();
        int i = random.nextInt(0, songs.size());
        return "Playing " + music.getClass().getSimpleName() + ": " + songs.get(i);
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
