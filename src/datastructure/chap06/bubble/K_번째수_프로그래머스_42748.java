package datastructure.chap06.bubble;

import java.util.Arrays;

public class K_번째수_프로그래머스_42748 {

     class Solution {
         public int[] solution(int[] array, int[][] commands) {

             int i=0;
             while(commands[i][0] != null) {
                 // 재정렬시킬 배열 생성
                 int[] temp = new int[commands[0][1] - commands[0][0] + 1];

                 // A배열에서 옮길 시작 인덱스 번호
                 int startNum = commands[0][0] - 1;

                 // 옮긴배열에 원하는 숫자 옮기기
                 for (int i = 0; i < temp.length; i++) {
                     temp[i] = array[startNum++];
                     System.out.print(temp[i]);
                 }

                 // 옮긴 숫자 정렬하기
                 for (int i = temp.length - 1; i > 0; i--) {
                     for (int j = 0; j < i; j++) {
                         if (temp[j] > temp[j + 1]) {
                             int t = temp[j];
                             temp[j] = temp[j + 1];
                             temp[j + 1] = t;
                         }

                     }
                 }

                 // 배열에서 원하는 숫자 빼내기
                 int targetIdx = commands[0][2] - 1;

                 // 원하는 숫자 출력
                 System.out.println(temp[targetIdx]);
             }



             int[] answer = {};
             return answer;
         }
     }
    public static void main(String[] args) {

        int array[] = {1, 5, 2, 6, 3, 7, 4};
        int command[] = {2, 5, 3};

        // 재정렬시킬 배열 생성
        int[] temp = new int[command[1] - command[0] + 1];


        // A배열에서 옮길 시작 인덱스 번호
        int startNum = command[0] - 1;


        // 옮긴배열에 원하는 숫자 옮기기
        for (int i = 0; i < temp.length; i++) {
            temp[i] = array[startNum++];
            System.out.print(temp[i]);
        }

        // 옮긴 숫자 정렬하기
        for (int i = temp.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (temp[j] > temp[j + 1]) {
                    int t = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = t;
                }

            }
        }

        // 배열에서 원하는 숫자 빼내기
        int targetIdx = command[2] - 1;

        // 원하는 숫자 출력
        System.out.println(temp[targetIdx]);


    }
}
