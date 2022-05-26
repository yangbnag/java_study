package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class run {
    public static void main(String[] args) {
       Student student1 = new Student(1,2,"홍길동",175.44,'남');
       student1.information();
    }
}
