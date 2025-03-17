package com.example.bigproject;

public class ImageItem {

    private int imageThumbnail;
    private String textTitel;

    public int getImageThumbnail() {
        return imageThumbnail;
    }

    public String getTextTitel() {
        return textTitel;
    }

    public ImageItem(int imageThumbnail, String textTitel) {
        this.imageThumbnail = imageThumbnail;
        this.textTitel = textTitel;
    }
}
