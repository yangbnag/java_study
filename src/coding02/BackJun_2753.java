package coding02;

import java.util.Scanner;

public class BackJun_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        int a = year % 4;
        int b = year % 100;
        int c = year % 400;

        //윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

        if (((a == 0) & (b != 0)) | (c == 0)) {
            System.out.println("1");
        }  else
            System.out.println("0");
    }
}

