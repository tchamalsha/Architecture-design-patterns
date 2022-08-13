package com.company.Adapter;

public class Mp4Player implements Player {
    @Override
    public void play(String filename) {
        System.out.println("Mp4 file is playing: "+filename);
    }
}
