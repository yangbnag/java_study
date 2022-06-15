package day16.api.string;

import utility.Util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringExample {
    public static void main(String[] args) {

        String s = "라면 떡볶이 보쌈 짜장면";
        // 문자열 쪼개기
        String[] sArr = s.split(" ");// 띄어쓰기 기준으로 쪼개서 배열을 리턴
        System.out.println(Arrays.toString(sArr));

        // 활용
        String ss = "1 2 3 4";
        String[] s1 = ss.split(" ");
        System.out.println(Arrays.toString(s1)); // 1, 2, 3, 4 를 배열에 한번에 넣을 수 있다.
        // int 배열에 넣으려면?
        int[] numbers = new int[s1.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(s1[i]);
        }
        System.out.println(Arrays.toString(numbers));
        Util.line();
        // 문자열 쪼개기 2번
        // ss를 공백을 통해 쪼갠다. split은 배열, Tokenizer는 queue에 담아주는 형식

        StringTokenizer st = new StringTokenizer(ss, " "); //

        // String ss 를 StringTokenizer를 통해 공백으로 쪼갠 후 int 배열에 담기
        int[] num = new int[st.countTokens()]; // 먼저 int 배열 생성

//        st.nextToken(); // poll 처럼 맨처음 토큰처럼 하나씩 소비를 시켜준다.
//        while (st.hasMoreTokens()) { // 꺼내먹을게 있는 동안 반복 시키겠다.

            for (int i = 0; st.hasMoreTokens(); i++) { // 토큰이 있는 동안에 for문을 반복
                num[i] = Integer.parseInt(st.nextToken()); // st.nextToken()으로 맨앞에 있는 String 토큰을 빼내고
                                                          // String 타입을 int로 형변환 하여 int 배열 num에 삽입
                                                           // for문이 종료될 동안 = token이 있는 동안 모든 토큰을 배열에 삽입
            }
            System.out.println(Arrays.toString(num));
//        }
        //  StringTokenizer st = new StringTokenizer(ss, " "); ss = [1,2,3,4] 일때  구분 기준은 ","로 써줘야 한다.

        Util.line();

        // #String의 기능 [결론 : String은 결합 연산에서 성능이 좋지 않다.]
        long start = System.currentTimeMillis();
        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            str += (i+1);
//            sb.append(i+1);
        }

        String sss = sb.toString(); // StringBuilder 사용 후 String 으로 사용하고 싶을 때때

       long end = System.currentTimeMillis();
        System.out.println((end-start) + "ms");
    }
}
