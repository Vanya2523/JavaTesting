package ru.tarabrin.test;

public class Rectangle {
    public int a;
    public int b;

    public Rectangle (int a, int b){
        this.a = a;
        this.b = b;
    }

    public int Area() {
        int c = this.a * this.b;
        return c;
    }
}
