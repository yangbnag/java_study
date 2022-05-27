package codingtest.programmers.level1;
//콜라츠 추측
public class L12943 {
    public static int solution(int num) {
        //입력된 수가 짝수라면 2를 나눈다
        //입력된 수가 홀수라면 3을 곱하고 1을 더한다
        // ex) 16 (짝수) -> /2
        // = 8 -> (짝수) /2 =
        // 4 (짝수) -> /2 =
        // 2 /2 = 1
        long n = num;
        int cnt = 0;
        while (true) {
            if(cnt == 500) {
                return -1;
            }

            if(n%2==0) {
               num /= 2;
               cnt++;
            } else{
                n = (n*3)+1;
                cnt++;
            }

            if(n==1) {
                return cnt;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(626331));
    }
}

