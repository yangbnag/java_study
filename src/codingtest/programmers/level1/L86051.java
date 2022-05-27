package codingtest.programmers.level1;

public class L86051 {
    public static int solution(int[] numbers) {
        int [] confirm = {0,1,2,3,4,5,6,7,8,9};

        int sum = 0;
        for (int n : numbers) {
            for (int i = 0; i <numbers.length ; i++) {
              if(n!=confirm[i]) {
                  System.out.println(confirm[i]);
              }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] testArr = {1,2,3,4,5,6,7,8};
        System.out.println(solution(testArr));
    }
}
