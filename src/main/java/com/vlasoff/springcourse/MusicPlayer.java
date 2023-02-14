package com.vlasoff.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music rockMusic;
    private Music classicalMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic, @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String playMusic(Genre genre) {
        if(genre.equals(Genre.CLASSICAL)) {
            return play(classicalMusic);
        } else {
            return play(rockMusic);
        }
    }

    private String play(Music music) {
        Random random = new Random();
        List<String> songs = music.getSongs();
        int i = random.nextInt(0, songs.size());
        return "Playing: " + songs.get(i);
    }
}
