package com.vlasoff.springcourse;

import java.util.List;

public class JazzMusic implements Music {
    private List<String> songs;

    public JazzMusic() {
        songs = List.of("Jazz: Dave Brubeck - Take Five",
                "Jazz: Miles Davis - So What",
                "Duke Ellington - Take The A Train");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
