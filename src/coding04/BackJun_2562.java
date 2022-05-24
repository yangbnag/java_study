package coding04;

import java.util.Scanner;

public class BackJun_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받은 정수의 수들을 저장할 배열 생성
        int[] arr = new int[9];
        // 9번을 입력 받고 배열에 저장.
        for (int i = 0; i < 9 ; i++) {
            arr[i] += sc.nextInt();
        }
        int idx = -1; // 최대값이 몇번째 인덱스에 있는지 찾을 변수
        int max = arr[0]; // 최대값을 구할 변수
        // 최대값 구하기
        for (int x : arr) {
            max =  x > max ? x : max;
        }
        // 최대값 인덱스 구하기
        for (int i = 0; i < arr.length ; i++) {
            if(max==arr[i]) {
                idx = i+1;
                break;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }
}
