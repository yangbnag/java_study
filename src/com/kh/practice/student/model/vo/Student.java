package com.kh.practice.student.model.vo;

public class Student {
    // === 필드 ===== //
    private String name; // 학생이름
    private String subject; // 과목이름
    private int score; //점수

    // === 생성자 ==== //
    public Student(){
    } // 기본 생성자

    public Student(String name, String subject, int score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    // 메서드 영역 //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public  String inform(){
        return String.format("이름: %s / 과목 : %s / 점수 : %d점",name,subject,score);
        // return 시 printf 처럼 사용 할수 있는 format
        // format은 문자열을 만들어서 리턴해준다.
    }
}
