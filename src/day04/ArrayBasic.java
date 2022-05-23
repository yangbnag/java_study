package day04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
        // 1. 배열 변수 선언
        int[] arr ;  // 타입 뒤에 대괄호 -> int 배열 타입의 변수를 선언하겠다.
        // int 배열 변수에는 숫자만 담을수 없다.

        // 2.배열의 생성
        arr = new int[5]; // heap이라는 공간에 할당 받으려고 할때 new로 heap에 호출 하고 타입과 공간에 들어갈 데이터 입력.
                    // stack 공간에 있는 변수에 heap에서 할당받은 주소를 입력.
        //arr에는 변수값이 아닌 heap에서 할당 받아서 데이터를 입력해놓은 주소값이 저장되어 있다.

        // 3.배열 값 초기화
        arr[0] = 30; // 30이라는 데이터를 배열에 넣으려고 한다. [I@5594a1b5 이 주소에 [0]첫번째 방에 30을 저장.
        arr[1] = 99;
        arr[2] = arr[0] + 20;
        arr[3] = (int)66.7; // 타입이 안맞는 데이터는 저장이 되지 않는다.
        // 타입 변환하여 배열에 저장.
//        arr[4] = 100;
//        arr[5] = 55; // runtime inception 에러 발생.
        //  arr = new int[5]; 로 선언하여 인덱스는 5개 저장이 가능한데 초과 하여 저장했기 때문에 에러 발생.
        // 치명적인 런타임 오류.

        // 배열의 길이 - 저장 데이터 개수
        System.out.printf("배열의 길이:%d\n", arr.length); // 인덱스를 5개다 채우지 않았을 경우에도 배열의 길이는 5이다.
        // 할당된 배열의 인덱스는 5이므로 인데스를 하나도 넣지 않아도 배열의 길이는 5이다.

        // 배열 내부 값 확인
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }
        // 반복문으로 확인하기 블록 설정 후 alt+enter // 루프로 축소 (인텔리j의 기능)
        System.out.println(); // 줄바꿈
        System.out.println("=============================================");

        // 배열 전용 반복문(향상된 for : Enhanced for Loop) -> JS의 for of와 비슷
        for (int n : arr) {
            System.out.printf("%d ",n);
        }
        System.out.println("");
        System.out.println("=============================================");

        // 배열 내부값 출력 함수
        System.out.println(Arrays.toString(arr));

        // 값 목록을 나열하여 배열 생성하기
        int[] numbers = new int[] {10,20,30,40};
        System.out.println(Arrays.toString(numbers));

        // new String[] 이런 구문은 배열변수 선언시에만 생략 가능
        String[] foods = {"사과","복숭아","파인애플"};
        System.out.println(Arrays.toString(foods));

        // 인데스 내용 변경경
       foods[1] = "수박";
        System.out.println(Arrays.toString(foods));

        // foods에 새로운 데이터를 입력하고자 한다.
        foods = new String[] {"짜장면","탕수육","짬뽕"};
        // 변수 선언을 하고 있는 것이 아니기 때문에 new String[] 생략이 불가능함.
        System.out.println(Arrays.toString(foods));

        // 배열을 생성만 하고 초기화하지 않는다면
        // -> 해당 타입의 기본값으로 자동초기화됨. (생성을 하는 순간부터 length의 기본값은 자동으로 저장됨)
        System.out.println("=================");
        double[] dArr = new double[0]; // 빈 배열을 만들고 싶으면 double[0]
        System.out.println("dArr.length = "+ dArr.length);
        System.out.println(Arrays.toString(dArr));


//        System.out.println(arr);// 자바스크립트는 배열안에 내용 없으면 undefined 이지만 자바는 에러

    }
}
