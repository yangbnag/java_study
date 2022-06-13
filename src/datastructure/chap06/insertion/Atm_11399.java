package datastructure.chap06.insertion;

import java.util.Arrays;
import java.util.Scanner;

public class Atm_11399 {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while(j > 0 && arr[j-1] >= temp) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr); // 삽입정렬

        // 구간합
        int[] S = new int[arr.length+1];
        for (int i = 1; i <= arr.length; i++) {
            S[i] = S[i - 1] + arr[i-1];
        }

        int result = 0;
        for (int i : S) {
            result += i;
        }

//        System.out.println(Arrays.toString(S));
        System.out.println(result);
    }
}
