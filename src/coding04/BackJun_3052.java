package coding04;

import java.util.Arrays;
import java.util.Scanner;

public class BackJun_3052 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // 나머지를 저장할 배열
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int inputNum = sc.nextInt();
            int rest = inputNum % 42;

            while (i < 10) {
                if (rest != arr[i]) {
                    arr[i] = rest;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

