package com.vlasoff.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs;

    public RockMusic() {
        songs = List.of("Rock: Johnny B. Goode - Chuck Berry",
                "Rock: Respect - Aretha Franklin",
                "Rock: Billie Jean - Michael Jackson");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
