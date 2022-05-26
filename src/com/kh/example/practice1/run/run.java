package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class run {
   public static void main(String[] args) {
      // 객체 생성
      // 클래스의 이름이 타입이 된다.
      Member kim = new Member();
      kim.changeName("김똘똘");
      kim.printName();
   }

}
