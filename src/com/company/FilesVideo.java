package com.company;

public class FilesVideo extends FilesMultimedia{
    private int pictureSize;

    public FilesVideo(String name, int size, String format, String description, String time, int pictureSize) {
        super(name, size, format, description, time);
        this.pictureSize = pictureSize;
    }

    public int getPictureSize() {
        return pictureSize;
    }

    public void setPictureSize(int pictureSize) {
        this.pictureSize = pictureSize;
    }

    public void print() {
        System.out.println(getName() + getSize() + getDescription() + getTime() + pictureSize);
    }
}
