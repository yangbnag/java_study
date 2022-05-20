package coding02;

import java.util.Scanner;

public class BackJun_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();

        int max = a;
        if (max<b) max = b;
        if (max<c) max = c;

        //3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다
        //3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.
        //3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

        /*
        같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
         */


        if ((a == b) && (b == c)) {
            System.out.println(10000 + (a * 1000));
        } else if ((a == b) || (a == c)) {
            System.out.println(1000 + (a * 100));
        } else if (b == c) {
            System.out.println(1000 + (b * 100));
        } else {
            System.out.println(max * 100);
        }


/*
*  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();

        // 가장 큰 눈 찾기
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;

        // 3개가 모두 같은 경우
        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        }
        // 2개가 같은 경우
        else if (a == b || a == c) {
            System.out.println(1000 + a * 100);
        } else if (b == c) {
            System.out.println(1000 + b * 100);
        }
        // 모두 다른 경우
        else {
            System.out.println(max * 100);
*/

    }
}


