package day15.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EasyScanner {

    private static Scanner sc;
    static {
        sc = new Scanner(System.in);
    }
    // 정수 입력 기능
    public static int inputInteger(String msg) throws Exception { // try catch 의 번거로움을 호출부로 미루겠다.
        System.out.println(msg);
        int n = sc.nextInt();
        sc.nextLine();

        return n;
    }

    // 실수 입력 기능
    public static double inputFloat(String msg) throws Exception {
        System.out.println(msg);
        double n = sc.nextDouble();
        sc.nextLine();

        return n;
    }


}
