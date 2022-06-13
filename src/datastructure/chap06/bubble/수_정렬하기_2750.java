package datastructure.chap06.bubble;

import java.util.Arrays;
import java.util.Scanner;

public class 수_정렬하기_2750 {
    public static void sort(int[] arr) {
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();

        }

        sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }



}
