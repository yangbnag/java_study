package com.kh.practice.point.model.vo;

public class Circle extends Point{

    private int radius;


    public Circle() {}

    public Circle(int x, int y, int radius) {
        super(x, y); // 접근 제한자를 정확히 이해 할 것.
        //this.setX(x);
        //this.setY(y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String toString() {
        return super.toString() + ", radius: " + radius;
    }
}
