package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {
    public static void main(String[] args) {
        PhoneController pc = new PhoneController();

//        System.out.println(pc.method());

        String[] method = pc.method();

        for (String s : method) {
            System.out.println(s);
        }




        }

    }

