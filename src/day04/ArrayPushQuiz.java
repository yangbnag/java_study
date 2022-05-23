package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static void main(String[] args) {
        // 빈배열 foodslist
        String[] foodlist = new String[0];

        Scanner sc = new Scanner(System.in);


        while(true) {
            // 입력 받은 내용
            String foods = sc.next();
            if(foods.equals("그만"))
            {
                System.out.println(Arrays.toString(foodlist));
                break;
            }
            // 방을 추가하여 입력받을 배열 생성 temp
            String[] temp = new String[foodlist.length + 1];
            System.out.println(Arrays.toString(foodlist));

            for (int i = 0; i < foodlist.length; i++) {
                temp[i] = foodlist[i];
            }
            // 추가된 방(배열) temp 에 입력받은 값을 저장
            temp[temp.length - 1] = foods;


            // 주소 초기화
            foodlist = temp;
            temp = null;

        }


    }
}
