package coding04;

import java.util.Scanner;

public class BackJun_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 곱할 3개의 정수 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        // 입력 받은 3개의 정수 곱하기
        int multiplication = a * b * c;
        System.out.println(multiplication);

        //0 부터 9까지의 등장 횟수를 카운팅해서 저장할 배열
        int[] arr = new int[10];
        //17,037,300
        for (int i = 1; i <0; i++) {
            System.out.print((multiplication / 1 ) % 10);
             System.out.print((multiplication / 10) % 10);
            System.out.print((multiplication / 100) % 10);
            System.out.print((multiplication / 1000) % 10);
            System.out.print((multiplication / 10000) % 10);
            System.out.print((multiplication / 100000) % 10);
            System.out.print((multiplication / 1000000) % 10);
            System.out.print((multiplication / 10000000) % 10);

        }


    }
}
