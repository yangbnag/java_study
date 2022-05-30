package codingtest.programmers.level1;
// 이상한 문자 만들기

/*
123 12345 12345 -> count
try hello world
^ ^ ^ ^ ^ ^ ^ ^ 대문자 변환 문자 -> count가 홀수인 경우 대문자 변환

변환완료된 단일문자들을 하나로 합쳐서 문자열로 구성

 - 의사 코드
   각 단어의 위치를 기억할 count 변수를 선언 초기값 0;
   완성문자열을 저장할 변수;

   for (문자열의 길이만큼 반복) {
    한글자씩 뽑아내서 공백인 경우 count를 0으로 만들고
    공백이 아닌경우 count를 1씩 증가시키면서
    홀수카운트일 경우 대문자 변환을 하고 짝수 카운트일 경우 소문자변환을 한다.
    지속적으로 변환한 문자를 하나의 문자열로 합친다.
    }
    완성 문자열을 반환;
 */
public class L12930A {
    static String solution(String s) {
        int count = 0;
        String answer = "";
        for (int i = 0; i < s.length() ; i++) {
            // 한글자 씩 추출
            char c = s.charAt(i);
            // count값은 공백인 경우 0이 되고 아닌경우 1씩 증가
            count = (c == ' ') ? 0 : count +1;

            //c를 문자열로 변환
            String ss = String.valueOf(c);
            answer += (count %2 == 1) ? ss.toUpperCase() : ss.toLowerCase() ;

        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }
}



