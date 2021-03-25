package com.company;

public abstract class Files {
    protected String name;
    protected int size;

    public Files(String name, int size) {
        setName(name);
        setSize(size);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null)
            throw new IllegalArgumentException("name can't be null.");
        this.name = name;
    }

    public int getSize() {
            return size;
        }

        public void setSize(int size) {
            if (size<0)
                throw new IllegalArgumentException("size cant be less than zero.");
            this.size = size;
        }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", size=" + size;
    }


    public static void printAll(Files[] pp) {
        for(Files p: pp) {
            //p.print();
            System.out.println(p);
           // System.out.println();
        }
    }
}
