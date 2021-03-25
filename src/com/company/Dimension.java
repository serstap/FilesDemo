package com.company;

public class Dimension {
    private int height;
    private int width;
    //private String dem;

    public Dimension(int height, int width) {
        this.height = height;
        this.width = width;
      /*  setHeight(height);
        setWidth(width);*/
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public void print() {
      //  System.out.println(height + "  "  + width);
        //System.out.println(Integer.toString(height));
       // System.out.println(Integer.toString(width));
      //  System.out.println(dem);
    }

}

