package Methodpakage;

import java.util.Arrays;

public class PushMethod {
    static String[] foods = {"떡볶이","치킨","파스타"}; // 전역변수 처럼 사용하기
    //foods 배열에 마지막위치에 데이터를 추가하는 함수 push()
    static void push(String newFood) {
        String[] temp = new String[foods.length+1];
        for (int i = 0; i <foods.length ; i++) {
            temp[i]=foods[i];
        }
        temp[temp.length -1] = newFood;
        foods=temp;
    }
    // 배열 내부데이터 출력함수
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }
    public static void main(String[] args) {

    }

}
