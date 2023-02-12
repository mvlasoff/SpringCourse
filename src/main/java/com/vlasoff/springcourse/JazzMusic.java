package com.vlasoff.springcourse;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {

    public JazzMusic() {
    }

    @Override
    public String getSong() {
        return "What A Wonderful World";
    }
}
