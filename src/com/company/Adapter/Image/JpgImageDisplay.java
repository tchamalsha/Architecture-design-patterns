package com.company.Adapter.Image;

public class JpgImageDisplay implements ImageDisplay {
    @Override
    public void show(String filename) {
        System.out.println("JPG image is displaying: "+filename);
    }
}
