package codingtest.programmers.level1;

// 음양 더하기
public class L76501 {
   static public int solution(int[] absolutes, boolean[] signs) {
        long total = 0;
        for (int i = 0; i < absolutes.length ; i++) {
            // 부호가 붙은 원래 숫자
            int n = signs[i] ? absolutes[i] : -absolutes[i];
            total += n;
        }
        return (int) total;
/* pseudo code
총합을 저장할 변수;
for(absolutes 배열의 크기만큼) {
signs 배열의 논리값을 확인하여
absolutes 배열의 정수값에 부호를 붙인다음
총합에 누적;
}
총합을 리턴
 */

    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        boolean[] b = {false, false, true};
        System.out.println(solution(a,b));
    }
}