package day06;

import java.util.Arrays;

public class MethodPractice {
    static String[] foods = {"떡볶이", "치킨", "파스타"}; // 전역변수 처럼 사용하기

    //foods 배열에 마지막위치에 데이터를 추가하는 함수 push()
    static void push(String newFood) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = newFood;
        foods = temp;
    }

    //배열의 인덱스를 탐색하는 함수
    static int indexOf(String newFood) {
        int idx = -1; // 인덱스를 저장할 변수
        for (int i = 0; i < foods.length; i++) {
            if (newFood.equals(foods[i])) {
                idx = i;
            }
        }
        return idx;
    }

    //boolean 함수
    static boolean include(String targetName) {
        return indexOf(targetName) != -1;
    }

    //splice 함수
    static void remove(String newFood) {
        //배열에 입력한 인수를 탐색
        int targetIdx = indexOf(newFood); // 배열에 입력한 인수를 탐색
        if(targetIdx==-1) {
            System.out.println("존재하지 않는 음식명입니다.");
            return;}

        //targetIdx 까지 새로운 배열을 재배치(앞 인덱스로 이동)
        for (int i = targetIdx; i < targetIdx ; i++) {
            foods[i] = foods[i+1] ;
        }
        //마지막 인덱스 삭제
        //새로운 배열 생성
        String[] temp = new String[foods.length-1];
        //기존 배열에서 새로운 배열로 데이터 복사. 마지막 인덱스는 복사x
        for (int i = 0; i <foods.length-1 ; i++) {
            temp[i] = foods[i];
        }

        //기존 배열로 주소값 이동
        foods = temp;
    }
    //modify
    static void modify(int targetIdx, String foodName) {
        foods[targetIdx] = foodName;
    }
static void clear(){
        foods = new String[0];
}
        // 배열 내부데이터 출력함수
        static void printFoods () {
            System.out.println(Arrays.toString(foods));
        }
        public static void main (String[]args){

            printFoods();
            push("라면");
            push("김치찌게");
            printFoods();

            // 탐색 함수 만들기_연습
            //idx에 2가 리턴되어야 함.
            int idx = indexOf("파스타");
            System.out.println(idx);

            //idx에 4가 리턴되어야 함.
            idx = indexOf("김치찌게");
            System.out.println(idx);

            //idx에 -1이 리턴되어야 함.
            idx = indexOf("짜장면");
            System.out.println(idx);

            // splice 함수 만들기 연습
            remove("김치찌개"); // foods배열에서 김치찌개 제거
//            remove("망고"); // 존재하지 않는 음식명입니다 출력.

            printFoods();


            boolean flag = include("파스타"); // 파스타 발견시 true 리턴
            boolean flag2 = include("양념치킨"); // 양념치킨 미발견시 false 리턴
            System.out.println(flag);
            System.out.println(flag2);

//            clear();  // foods배열 모든 데이터 삭제
            modify(2, "닭갈비");  // 2번 인덱스 데이터 닭갈비로 수정
            printFoods();

/*
            insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입


*/
        }//main end
    } // class end
