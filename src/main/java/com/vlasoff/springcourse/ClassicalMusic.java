package com.vlasoff.springcourse;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> songs;

    public ClassicalMusic() {
        songs = List.of("Classical: Mozart – Eine kleine Nachtmusik",
                "Classical: Beethoven – Für Elise",
                "Classical: Puccini – 'O mio babbino caro' from Gianni Schicchi");
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
