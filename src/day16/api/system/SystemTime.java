package day16.api.system;

import datastructure.chap06.bubble.BubbleSort;
import datastructure.chap06.insertion.InsertionSort;
import datastructure.chap06.selection.SelectionSort;
import datastructure.chap07.radix.RadixSort;
import utility.Util;

import java.util.Arrays;
import java.util.Date;

public class SystemTime {
    public static void main(String[] args) {

        // 현재 시간 읽기
        // 유닉스 시간 : 1970년 1월 1일 00시를 기준으로
        //             현재까지 지나온 시간을 초로 표현
        long now = System.currentTimeMillis();
        System.out.println(now); // 현재 시간을 밀리세컨드 (1000분의 1초) 로 표현
        // 1,655,261,312,222 (16억초)
        // 1,655,261,389,056

        Date date = new Date(now);// Java.util에 있는 Date 사용
        System.out.println(date); // currentTimeMillis() 에서 받은 밀리초 시간을 현지시간으로 변화 시켜주는 API

        // 내일을 표현하고 싶다.
       Date tomorrow = new Date(now + 24*60*60*1000);
        System.out.println(tomorrow);

        // 알고리즘 시간 복잡도를 구할 수있다.
        Util.line();
        // 정렬 알고리즘 속도를 currentTimeMillis()를 활용하여 측정하기
        int[] arr = new int[100000000];
        for (int i = arr.length-1; i>=0; i--) {
            arr[i] = arr.length - i;
//            System.out.println(arr[i]);
        }

        // 정렬 알고리즘 시간 테스트
        long s = System.currentTimeMillis(); // 버블 정렬 전 시간 측정

//        BubbleSort.sort(arr); // 버블 정렬 : 4156ms
//           SelectionSort.sort(arr); // 선턱정렬 : 3750ms
//        InsertionSort.sort(arr); // 삽입 정렬: 1844ms
//        RadixSort.sort(arr); // 기수 정렬: 78ms
        Arrays.sort(arr); // 쿠기 정렬 : 0ms

        long e = System.currentTimeMillis(); // 버블 정렬 후 시간 측정

        System.out.println((e - s) + "ms");
    }
}
