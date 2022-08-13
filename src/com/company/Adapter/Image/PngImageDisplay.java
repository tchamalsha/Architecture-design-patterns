package com.company.Adapter.Image;

public class PngImageDisplay implements ImageDisplay {
    @Override
    public void show(String filename) {
        System.out.println("PNG image displaying: "+filename);
    }
}
