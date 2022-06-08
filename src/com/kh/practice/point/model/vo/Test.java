package com.kh.practice.point.model.vo;

public class Test extends Object {
    public static void main(String[] args) {
        Point p = new Point(10,20);

        System.out.println(p);
        System.out.println("dd");

        // Point의 부모는 Object이다.
        // toString()는 Object의 메서드 이다.
//        System.out.println(); 는 p.toString()이 생략된것이다.
    }
}
