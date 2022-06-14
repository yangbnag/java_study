package datastructure.chap06.bubble;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class K_번째수_프로그래머스_42748 {

        public static int[] solution(int[] array, int[][] commands) {
//        System.out.println(Arrays.toString(array));

            // 정답 배열
            int[] answer = new int[commands.length];

            // 2차원 배열을 반복하여 결과를 하나씩 추출
            for (int i = 0; i < commands.length; i++) {
                int a = commands[i][0] - 1; // 배열 슬라이싱 시작인덱스
                int b = commands[i][1]; // 배열 슬라이싱 끝인덱스
                int c = commands[i][2] - 1; // 정렬 후 결과값이 될 인덱스

                // 배열 슬라이싱 (배열 자르기)
                int[] slicedArr = new int[b - a];

                for (int j = 0; j < slicedArr.length; j++) {
                    // 1번째 ~ 7번째 -> a : 0, b : 7
                    // A[i] = B[i]

                    // 2번째 ~ 5번째 -> a: 1, b : 5
                    // A[i] = B[i+1]

                    // 3번째 ~ 6번째 -> a: 2, b : 6
                    // A[i] = B[i+2]
                    slicedArr[j] = array[j + a];
                }
//            System.out.println(Arrays.toString(slicedArr));

                // 오름차 정렬
                Arrays.sort(slicedArr); // nlogn 시간복잡도 : 퀵소트

                // 정렬된 배열에서 결과값 확보
                int result = slicedArr[c];
                answer[i] = result;
            }

            return answer;
        }

        public static void main(String[] args) {

            int[] A = {1,5,2,6,3,7,4};
            int[][] B = {{2,5,3}, {4,4,1}, {1,7,3}};
            int[] solution = solution(A, B);
            System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
        }
    }


    /*
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
                 i++;
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

*/
