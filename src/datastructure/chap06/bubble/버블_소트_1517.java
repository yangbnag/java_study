package datastructure.chap06.bubble;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class 버블_소트_1517 {

    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        // 비교 범위에 대한 루프
        for (int i = a.length - 1; i > 0; i--) {
            // 실제 비교
            for (int j = 0; j < i; j++) { // 왼쪽이 더 크면 자리 바꿈
                // swap
                if(a[j] > a[j + 1]) {
                    count++;
                }
            }
        }

        System.out.println(count);


    }
}
