/**
 * 주석을 연습하는 클래스다~
 * API Document 주석 : 웹사이트에 올렸을 때
 *    자동으로 html 태그로 변환되어 코드를 보지 않아도
 *    웹에 나타나는 주석
 *
 * @author - yang
 * @email - yanbam@naver.com
 */

package day01;

import java.util.Scanner;

// 자바는 클래스라는 블록에서 코드가 시작됩니다.
public class Comment {

    //함수를 호출하려면 main함수가 필요합니다.
    public static void main(String[] args) {

        /*
            메인 함수는 프로그램의 실행 시작 지점이며
            메인 함수 없이 프로그램은 실행되지 않습니다.
        */

        //출력 함수
        System.out.println("hello");
        int a = 10, b = 20;
        System.out.println(a+b);

        Scanner sc = new Scanner(System.in);
        int startPlayer = (int) Math.floor(Math.random() * 3) + 1;
        System.out.println(startPlayer);

        double x = 3.3;
        int y = (int) x;

        System.out.println(y);
    } // end main
} // end class
