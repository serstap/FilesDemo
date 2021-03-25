package com.company;

public class FilesPicture extends Files {
    private String format;
    //private int size;
    //private Dimension height;
    private Dimension dem;

    public FilesPicture(String name, int size, String format, Dimension dem) {
        super(name, size);
        this.format = format;
        this.dem = dem;
         //this.size = size1;

    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Dimension getDem() {
        return dem;
    }

    public void setDem(Dimension dem) {
        this.dem = dem;
    }
 /*public FilesPicture(String name, int size, String name1, Dimension height) {
        super(name, size);
        this.name = name1;
        this.height = height;
        this.width = width;

    }*/




    public void print() {
        System.out.println(getName() + getSize() + format + dem);

       // System.out.println(getName() + getSize() + height +  width);
    }
}
