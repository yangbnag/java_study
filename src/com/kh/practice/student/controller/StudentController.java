package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
    // 필드
    private Student[] sArr;
    public static final int CUT_LINE = 60; // 상수

    // 생성자
    public StudentController() {
        sArr = new Student[5];
        sArr[0] = new Student("김길동", "자바", 100);
        sArr[1] = new Student("박길동", "디비", 50);
        sArr[2] = new Student("이길동", "화면", 85);
        sArr[3] = new Student("정길동", "서버", 60);
        sArr[4] = new Student("홍길동", "자바", 20);
    }

    // 메서드
    // 객체배열에 있는 데이터를 반환
    public Student[] printStudent() {
        return sArr;
    }

    // 개체 배열의 점수를 합한 값을 리턴
    public int sumScore() {
        int sum = 0;
        for (Student s : sArr) {
            sum += s.getScore();
        }
        return sum;
    }

    // double배열을 만들어 sumScore의 리턴 값을 0번째 인덱스에 저장하고 합의 평균을 1번째
//인덱스에 저장 후 배열리턴
    public double[] avgScore() {
        int sum = sumScore();
        double avg = (double) sum / sArr.length;
        return new double[] {sum, avg};
        // ********** new double[] 는 어디서 생긴거지? ************
//        double[] test = new double[0];
    }
}
