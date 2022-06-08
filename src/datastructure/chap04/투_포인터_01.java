package datastructure.chap04;

import java.util.Scanner;

public class 투_포인터_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();// 찾아야 하는 부분합
        int[] arr = new int[N];
        for (int i = 0; i <N; i++) {
            arr[i] = i + 1;
        }
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//        int N = arr.length; // 찾아야 하는 부분합

        int start = 0, end = 0; // 포인터 (배열의 인덱스를 가리킨다.)
        int M = arr[start]; // 부분합을 저장
        int count = 0; // M이 N이 되는 경우의 수

        while (end < N) {
//            System.out.printf("start: %d, end: %d, M: %d, count: %d\n"
//                    , start, end, M, count);
            if (M == N) {
                count++; // 원하는 합을 발견한 경우 경우의 수 증가
                end++;
                if (end < N) M += arr[end];

            } else if (M > N) {
                M -= arr[start];
                start++;

            } else {
                end++;
                M += arr[end];
            }
        }// end while
        System.out.println(count);

    }
}
