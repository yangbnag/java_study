package codingtest.programmers.level1;

import java.util.Arrays;

public class L86051 {
    public static int solution(int[] numbers) {
        int[] confirm = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;
        for (int n : numbers) {
            for (int i = 0; i < confirm.length; i++) {
                if(n!=confirm[i])
                    continue;
                confirm[i] = 0;
            }
        }
        for (int n : confirm) {
            sum += n;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] testArr = {0};
           int a = solution(testArr);
        System.out.println(a);
    }
}
