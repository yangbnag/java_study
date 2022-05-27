package codingtest.programmers.level1;
// 7로 나누면 나머지 0 -> 목
// 7로 나누면 나머지 1 -> 금
// 7로 나누면 나머지 2 -> 토
// 7로 나누면 나머지 3 -> 일
// 7로 나누면 나머지 4 -> 월
// 7로 나누면 나머지 5 -> 화
// 7로 나누면 나머지 6 -> 수

public class L12901 {
    public static String solution(int a, int b) {
        int calendar[] = {31, 29, 31, 30, 31, 30,31,31,30,31,30,31};
        int num = 0;
        for (int i = 0; i < a - 1; i++) {
            num += calendar[i];
        }
        num = (num+b)%7;
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};

        String answer = day[num];
        return answer;
    }

    public static void main(String[] args) {
/*        for (int i = 0; i < 31; i++) {
            System.out.println(solution(5,i));
        }*/
            System.out.println(solution(5,24));

       
    }
}