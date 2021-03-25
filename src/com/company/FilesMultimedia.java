package com.company;

public class FilesMultimedia extends Files {
    protected String format;
    protected String description;
    protected String time;

    public FilesMultimedia(String name, int size, String format, String description, String time) {
        super(name, size);
        this.format = format;
        this.description = description;
        this.time = time;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", format='" + format + '\'' +
                ", description='" + description + '\'' +
                ", time='" + time + '\'';
    }

    public void print() {
        System.out.println( name + size + format + description + time);
    }
}

