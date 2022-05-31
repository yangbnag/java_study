package com.kh.hw.member;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        MemberController mc = new MemberController();
        System.out.println(mc.existMemberNum());
//       int index = mc.findIndexById("abc1234");
//        System.out.println("인덱스 : "+ index);
//       System.out.println(mc.checkId("abc"));
//
//        mc.insertMember("ABCD","김출수","1234","abc@naver.com",'M',24);
//        mc.insertMember("ABdD","김출수","1234","abc@naver.com",'M',24);
//        System.out.println(mc.existMemberNum());
//        System.out.println(mc.checkId("ABdD"));
//
//        System.out.println(mc.printAll());
//
//
//        System.out.println(mc.searchId("a").inform());
//
//        System.out.println(Arrays.toString(mc.searchName("김철수")));

        System.out.println(mc.updatePassword("a","5678"));
        System.out.println(mc.searchId("a").inform());

        System.out.println(mc.updateName("d","박뚱뚱"));
        System.out.println(mc.searchId("d").inform());

        System.out.println(mc.updateEmail("d","www@www"));
        System.out.println(mc.searchId("d").inform());

//        System.out.println(mc.delete("a"));

       Member member = mc.searchId("a");
        System.out.println(member.inform());

        mc.updateName("a","냥냥이");
        System.out.println(member.inform());

        mc.delete("a");
        System.out.println(Arrays.toString(mc.printAll()));

        mc.delete();
        System.out.println(Arrays.toString(mc.printAll()));





    }
}
