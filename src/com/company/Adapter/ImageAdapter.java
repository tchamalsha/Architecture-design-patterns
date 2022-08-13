package com.company.Adapter;

import com.company.Adapter.Image.ImageDisplay;

public class ImageAdapter implements Player {

    ImageDisplay imageDisplay;

    public ImageAdapter(ImageDisplay imageDisplay) {
        this.imageDisplay = imageDisplay;
    }


    @Override
    public void play(String filename) {
        imageDisplay.show(filename);
    }
}
