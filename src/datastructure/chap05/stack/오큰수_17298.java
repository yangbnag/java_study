package datastructure.chap05.stack;

import java.util.Scanner;
import java.util.Stack;

public class 오큰수_17298 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < A.length; i++) {

            for (int j = i; j < A.length; j++) {

                if (A[i] < A[j]) { // 큰수 찾기
                    stack.add(A[j]);

                } else if (A[0] > A[1]) {
                        stack.add(-1);

                }

                if (i == A.length - 1) {
                    stack.add(-1);
                    break;
                }
            }
        }
        System.out.println(stack);
    }
}

