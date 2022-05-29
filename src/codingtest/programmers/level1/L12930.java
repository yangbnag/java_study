package codingtest.programmers.level1;

import java.util.Arrays;

public class L12930 {
    public static String solution(String s) {
        // 문자열을 추출 공백으로 단어 구분
        // 0번 부터 짝수는 대문자
        // 1번 부터 홀수는 소문자로 변경

        //문자열을 하나씩 추출 해보자
        // 하나씩 추출해서 0번 인덱스는 대문자, 1번 인덱스는 소문자
        // char 타입으로 추출해서 String.valueOf로 문자열 변경후 대소문자 만들기
        // 변경한 문자열을 저장할 배열 만들기
        String[] newS = new String[s.length()];
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                newS[i] = " ";
                continue;
            }

            String toUpperCase = String.valueOf((s.charAt(i))).toUpperCase();
            if (i == 0) {
                newS[i] = toUpperCase;
                System.out.println("i가 0  "+i);
                System.out.println(s.charAt(i));
                System.out.println(newS[i]);
            }

            else if (i == 1) {
                newS[i] = String.valueOf((s.charAt(i))).toLowerCase();
//                System.out.println(s.charAt(i));
//                System.out.println(newS[i]);
                System.out.println("i가 1  "+i);
                System.out.println(s.charAt(i));
                System.out.println(newS[i]);

            } else if ((int) s.charAt(i-1) <=97) {
                newS[i] = String.valueOf((s.charAt(i))).toLowerCase();
                System.out.println("대문자  "+i);
                System.out.println(s.charAt(i-1));
                System.out.println(newS[i]);

            } else  {
                newS[i] = toUpperCase;
                System.out.println("소문자  "+i);
                System.out.println(s.charAt(i));
                System.out.println(newS[i]);
            }

        }
        for (String newS1 : newS) {
            answer += newS1;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "aaaa bbb ddddd kdn ";
        System.out.println(solution(s));
        System.out.println((int)s.charAt(2));
        System.out.println((int)' ');

    }
}



