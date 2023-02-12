package com.vlasoff.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application_context.xml"
        );

        Music classicalMusic = context.getBean("classicalMusic", Music.class);
        Music jazzMusic = context.getBean("jazzMusic", Music.class);
        Music rockMusic = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(List.of(classicalMusic, jazzMusic, rockMusic));
        musicPlayer.playMusicList();

        context.close();
    }
}
