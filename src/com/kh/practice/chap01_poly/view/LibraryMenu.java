package com.kh.practice.chap01_poly.view;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;
import utility.Util;

import java.util.Scanner;

public class LibraryMenu {
    LibraryController lc = new LibraryController();
    Scanner sc = new Scanner(System.in);


    public void mainMenu(){

        // 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
        // LibraryController의 insertMember() 메소드에 전달
       String name = Util.inputS("이름 : ");
       int age = Util.inputN("나이 : ");
       String gen = Util.inputS("성별 :");
       char gender = gen.charAt(0);

       lc.insertMember(new Member(name,age,gender));


        System.out.println("==== 메뉴 ====");  // 무한 반복 실행
        System.out.println("1. 마이페이지");  // LibraryController의 myInfo() 호출하여 출력
        System.out.println("2. 도서 전체 조회");  // LibraryMenu의 selectAll() 호출
        System.out.println("3. 도서 검색");  // LibraryMenu의 searchBook() 호출
        System.out.println("4. 도서 대여하기");  // LibraryMenu의 rentBook() 호출
        System.out.println("9. 프로그램 종료하기");
        System.out.println("메뉴 번호 :");

        int menu = Util.inputN("메뉴: ");

        switch (menu) {
            case 1:
                myInfo();
                break;
            case 2:
                selectAll();
                break;
            case 3:
                searchBook();
                break;
            case 4:
                rentBook();
                break;
            case 9: return;
            default:return;
}
    }

    public void myInfo(){


    }
    public void selectAll(){

    }
    public void searchBook(){

    }

    public void rentBook(){

    }

}
