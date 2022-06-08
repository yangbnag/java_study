package datastructure.chap04;

import java.util.Arrays;
import java.util.Scanner;

public class 투_포인터_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
//        int[] arr = {2,7,4,1,5,3};
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(N));

//        int M = 9;
        int start = 0;
        int end = arr.length-1;
        int count = 0;

        while(arr[start] < arr[end]) {
//            System.out.printf("start: %d, end: %d, M: %d, count: %d\n"
//                  , start, end, arr[start]+arr[end], count);
            if ((arr[start] + arr[end]) == M) {
                start++;
                end--;
                count++;
            } else if ((arr[start] + arr[end]) < M) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(count);

    }
}
