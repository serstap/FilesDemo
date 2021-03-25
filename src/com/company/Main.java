package com.company;

public class Main {

    public static void main(String[] args) {
        Dimension b = new Dimension(1025,584 );
      // System.out.println(Integer.toString(b.getHeight()));
        //System.out.println(Integer.toString(b.getWidth()));
        Files[] pp = {
                new FilesDoc("j110",  23212, "docx", 2),
                new FilesPicture("spbmap ",  1703527, " image ", b),
                new FilesMultimedia("06-PrettyGirl ",  7893454, " audio ", " Eric Clapton, Pretty Girl ", "05:28"),
                new FilesVideo("BackToTheFuture ",  1470984192, " video ", " Back to the future ", "01:48:08", 640)

        };

        Files.printAll(pp);
      //  b.print();
        FilesMultimedia[] dd = {
                new FilesMultimedia("06-PrettyGirl ",  7893454, " audio ", " Eric Clapton, Pretty Girl ", "05:28"),
                new FilesVideo("BackToTheFuture ",  1470984192, " video ", " Back to the future ", "01:48:08", 640)

        };
        Files.printAll(dd);
    }

    /*@Override
    public String toString() {
        return super.toString();
    }(7788,  1474192)*/
}
