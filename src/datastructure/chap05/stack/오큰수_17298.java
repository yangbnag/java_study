package datastructure.chap05.stack;

import java.util.Scanner;
import java.util.Stack;

public class 오큰수_17298 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        /*int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        } */
        int N = 4;
        int [] a = {9,5,4,8};

        for (int i = 0; i < N; i++) {
            int targetNum = a[i];
            for (int j = i+1; j < N; j++) {
                if(targetNum < a[j]) {
                    System.out.println("add targetNum :"+targetNum+", a[j] :"+a[j]);
                    stack.add(a[j]);
                    break;
                } else System.out.println("-1 targetNum :"+targetNum+", a[j] :"+a[j]); stack.add(-1); break;
            }
        }







                }
            }





