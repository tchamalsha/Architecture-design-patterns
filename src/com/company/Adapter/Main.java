package com.company.Adapter;

import com.company.Adapter.Image.ImageDisplay;
import com.company.Adapter.Image.JpgImageDisplay;
import com.company.Adapter.Image.PngImageDisplay;

public class Main {

    public static void main(String[] args) {

        Player player = null;

        String fileName = "c://documents/text.jpg";

        if (fileName.endsWith("jpg")){
            ImageDisplay imageDisplay = new JpgImageDisplay();
            player = new ImageAdapter(imageDisplay);
        } else if (fileName.endsWith("png")) {
            ImageDisplay imageDisplay = new PngImageDisplay();
            player = new ImageAdapter(imageDisplay);
        } else if (fileName.endsWith("mp3")) {
            player = new Mp3Player();
        } else if (fileName.endsWith("mp4")) {
            player = new Mp4Player();
        }

        player.play(fileName);

    }
}
