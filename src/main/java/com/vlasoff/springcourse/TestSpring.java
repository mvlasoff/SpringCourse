package com.vlasoff.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application_context.xml"
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        System.out.println(computer.getMusicPlayer().getName());
        System.out.println(computer.getMusicPlayer().getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);

        context.close();
    }
}
