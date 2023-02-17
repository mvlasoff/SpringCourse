package com.vlasoff.springcourse;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.List;

public class ClassicalMusic implements Music {

    private List<String> songs;

    public ClassicalMusic() {
        songs = List.of("Mozart – Eine kleine Nachtmusik",
                "Beethoven – Für Elise",
                "Puccini – 'O mio babbino caro' from Gianni Schicchi");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Classical music init.");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Classical music destroy.");
    }
}
