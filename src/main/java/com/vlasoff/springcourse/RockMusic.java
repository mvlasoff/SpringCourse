package com.vlasoff.springcourse;

import java.util.List;

public class RockMusic implements Music {
    private List<String> songs;

    public RockMusic() {
        songs = List.of("Johnny B. Goode - Chuck Berry",
                "Respect - Aretha Franklin",
                "Billie Jean - Michael Jackson");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
