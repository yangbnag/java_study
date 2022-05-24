package coding04;

import java.util.Arrays;
import java.util.Scanner;

public class BackJun_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // n개의 정수의 개수

        int[] arr = new int[N]; // 입력 받은 정수를 저장할 배열

        // N만큼 반복해서 입력받은 정수를 순차적으로 배열에 초기화
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
//        System.out.println(Arrays.toString(arr));

        //최소, 최대값을 저장할 변수
        int min = arr[0], max = arr[0];
        for(int x: arr) {
            max = x > max ? x : max;
            min = x < min ? x : min;
        }
        System.out.printf("%d %d",min, max);
    }
}
