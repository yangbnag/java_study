package day04;

import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {

        // 배열 탐색 알고리즘
        // 인덱스 찾기, 유무 확인

        String[] foods = {"치킨","피자","삼겹살","파스타"};
        String target = "삼겹살";

        int index = -1; // 찾은 인덱스를 저장할 변수
        // -1은 인덱스가 가질수 없는 숫자
        for (int i = 0; i < foods.length; i++) {
            if(target.equals(foods[i])) {
                index=i; // 일치하는 인덱스가 없을 경우 for문이 종료되고 index는 초기값 -1
                break;
            }
        } // end for
        System.out.println("찾은인덱스: " + index);

        // 찾은 인덱스가 -1이 아니면 인덱스를 찾은 것이다.
        boolean hasFood = index != -1;
        System.out.println("존재 유무: " + hasFood);

        // 삼겹살을 수정 하려고 한다.
        foods[index] = "보쌈";
        System.out.println(Arrays.toString(foods));

    }}
