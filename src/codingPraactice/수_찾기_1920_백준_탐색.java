package codingPraactice;

import java.util.Arrays;
import java.util.Scanner;

public class 수_찾기_1920_백준_탐색 {

    public static int binarySearch(long[] arr, long target) {
        // 왼쪽포인터, 오른쪽 포인터, 중앙포인터 선언
        int left = 0;
        int right = arr.length - 1;
        int mid;


        while (left <= right) {
            // mid 인덱스 계산
            mid = (left + right) / 2;
            // 찾고자 하는 값이 mid값과 일치할 경우 탐색종료
            if (arr[mid] == target) {
                return 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long[] arrN = new long[(int) N];
        for (int i = 0; i < N; i++) {
            arrN[i] = sc.nextLong();
        }

        long M = sc.nextLong();
        long[] arrM = new long[(int) M];

        for (int i = 0; i < M; i++) {
            arrM[i] = sc.nextLong();
        }

        Arrays.sort(arrN);

        for (long l : arrM) {
            System.out.println(binarySearch(arrN,l));
        }



    }
}
