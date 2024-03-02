package com.springcore.ref;

public class B {
    private int y;

    private int h;
    private int j;

    public B() {
        super();
        // TODO Auto-generated constructor stub
    }

    //	getters
    public int getY() {
        return y;
    }
//    

    //	Setters
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "B [y=" + y + ", h=" + h + ", j=" + j + "]";
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }


}
