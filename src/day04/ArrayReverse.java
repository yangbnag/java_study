package day04;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        System.out.println("reverse 전 :" + Arrays.toString(arr));

        // length / 2의 몫 만큼 자리 이동을 해야 한다.

        for(int i=0; i<arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }


        System.out.println("reverse 후 :" + Arrays.toString(arr));
    }
}
