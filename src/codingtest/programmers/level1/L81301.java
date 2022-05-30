package codingtest.programmers.level1;
// 숫자 문자열과 영단어
public class L81301 {
    public static int solution(String s) {
String[] numberStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i <numberStr.length ; i++) {
            s = s.replace(numberStr[i],String.valueOf(i));
        }
        return Integer.parseInt(s);
    }


    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));
    }
}
