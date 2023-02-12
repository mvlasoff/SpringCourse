package com.vlasoff.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing Classical Music initialization.");
    }

    public void doMyDestroy() {
        System.out.println("Doing Classical Music destruction.");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
