package day02;

import java.io.IOException;

import java.util.Scanner;

public class StdInput {
    public static void main(String[] args) throws IOException {
//       int inputData = System.in.read(); // byte를 return 한다고 해서 타입을 int로 ..
//        System.out.println(inputData); // 모든 입력값을 숫자로 출력.
        // 사용하기 불편한 입력 방법

        //Scanner api 사용.

        Scanner sc = new Scanner(System.in); // 이해는 나중에 일단 외워야 함.
        // 스캐너의 함수들
        /*
         -next() : 문자열을 입력받을 때, 공백은 처리불가
         -nextLine() : 문자열 입력, 공백 포함 가능
         -nextInt() : 정수를 입력
         -nextDouble() : 실수를 입력
         */
        System.out.print("이름:");
        String name = sc.nextLine();
        System.out.println("name = " + name); // 입력창에서 입력 받은 값을 name의 변수로 저장.

        System.out.print("나이:");
        int age = sc.nextInt();
        System.out.println("age + 10 = " + (age + 10));

        // 스캐너 메모리 해제
        sc.close(); // 스캐너를 다 쓴경우 해제.





    } //  main end
} // class end
