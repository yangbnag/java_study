package com.kh.example.practice4.model.vo;

public class Student {
    //속성 - 필드 설정
    int grade;
    int classroom;
    String name;
    double height;
    char gender;

    //생성자
    public Student(int ngrade, int nclassroom,String nname, double nheight, char ngender) {
        grade = ngrade;
        classroom = nclassroom;
        name = nname;
        height = nheight;
        gender = ngender;
    }

    //메서드
    public void information() {
        System.out.println(grade + "학년");
        System.out.println(classroom + "반" );
        System.out.println(name);
        System.out.println("키: "+ height + "CM");
        System.out.println("성별: "+ gender);

    }
}
