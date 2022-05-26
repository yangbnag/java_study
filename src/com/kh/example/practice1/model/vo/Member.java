package com.kh.example.practice1.model.vo;

public class Member {
// 클래스와 객체 실습예제
    //필드 설정
    String memberId;
    String memberPwd;
    String memberName; // 이름 값
    int age;
    char gender;
    String phone;
    String email;

    // 기본 생성자 생성
    public Member() {}

    // 메서드 생성
    // 회원의 이름을 입력된 이름으로 변경
    public void changeName(String name){
        memberName = name;
    }

    //회원의 이름 출력
    public void printName(){
        System.out.printf("이름:%s\n",memberName);
    }


}
