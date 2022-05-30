package codingtest.programmers.level1;

public class L86051A {
    public static int solution(int[] numbers) {
        // 0 ~ 9  총합 구하기
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum+=i;
        }

        for (int n : numbers) {
            sum-=n;
        }
return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(solution(nums));
    }
}
