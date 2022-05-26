package day07;

import java.util.Scanner;

public class Stringequal {
    public static void main(String[] args) {
        String str1 = "A,B,C";
//        String str1 = new String("가나다"); // String은 객체
        //Value라는 필드가 존재함.
        // 그 배열에 A,B,C 를 저장

        Scanner sc = new Scanner(System.in);
        String str2 = sc.next();

        if (str1.equals(str2)) {
            System.out.println("두 문자열이 일치함");
        } else {
            System.out.println("두 문자열이 일치하지 않음");
        }
    }
}
