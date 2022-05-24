package day05;

import java.util.Scanner;

public class ScannerProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("정수: ");
        int n =sc.nextInt(); // 100\n이 입력이 되었고, n에 100만 입력

        //skip 해결 방법 : 잔여공백을 처리하고 넘어가야함.
        sc.nextLine(); // 정수 입력시 받은 \n을 처리 하는 nextLine;

        System.out.printf("문자열: " );
        String s= sc.nextLine(); //nextInt 다음에 nextLine이 나올때 skip 처리됨.
        // nextLine은 공백을 포함한 문자열을 취급한다.

        //원인 : next() 매운 오뎅 -> 매운만 취하고 오뎅이라는 데이터를 버퍼라는 공간에 쌓아놓는다.
        // sc.nextInt에 100을 입력하고 엔터를 치면 \n을 nextLine()에 입력하여 skip이 된다.

        System.out.println("s= " + s);
        sc.close();

    }
}