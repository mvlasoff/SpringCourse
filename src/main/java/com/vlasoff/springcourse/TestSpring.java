package com.vlasoff.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        System.out.println(computer.getMusicPlayer().getName());
        System.out.println(computer.getMusicPlayer().getVolume());

        context.close();
    }
}
