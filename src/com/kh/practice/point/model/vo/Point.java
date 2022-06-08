package com.kh.practice.point.model.vo;

public class Point {
    private int x;
    private int y;

    public Point(){} // No args

    public Point(int x, int y){ // All args
        this.x = x;
        this.y = y;
    }

    public String toString(){

        return String.format("x: %d, y: %d",x,y);
    }
    // 오브젝트의 메서드를 그 자식인 포인트 클래스에서 오버라이딩

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
