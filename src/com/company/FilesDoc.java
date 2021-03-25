package com.company;

public class FilesDoc extends Files {
    private String format;
    private int page;


     public FilesDoc(String name, int size, String format, int page) {
            super(name, size);
            this.format = format;
            this.page = page;
        }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "format='" + format + '\'' +
                ", page=" + page;
    }

    /*public void print() {
        System.out.println("File name " + getName() + " Size " + getSize() + " Details " + format + " " + page + " pages");
    }*/

}

