package com.springcore.ref;

public class A {
    private int x;
    private int a;
    private int b;
    private B ob;

    public A(int x, int a, int b, B ob) {
        super();
        this.x = x;
        this.a = a;
        this.b = b;
        this.ob = ob;
    }

    public A() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A [x=" + x + ", a=" + a + ", b=" + b + ", ob=" + ob + "]";
    }

}
