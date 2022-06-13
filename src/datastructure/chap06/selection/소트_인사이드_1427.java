package datastructure.chap06.selection;

import java.util.Arrays;
import java.util.Scanner;

public class 소트_인사이드_1427 {

    public static void sort(int[] arr) {

        // swap 대상을 타겟팅하는 루프
        for (int i = 0; i < arr.length - 1; i++) {
            // 최소값 탐색
            int max = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[max]) {
                    max = j; // 최댓값 인덱스 갱신
                }
            }
            // swap
            int temp = arr[i] ;
            arr[i] = arr[max] ;
            arr[max] = temp;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int arr[] = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(""+str.charAt(i));
        }

        sort(arr); // 선택정렬

        for (int i : arr) {
            System.out.print(i);
        }

    }

    }
