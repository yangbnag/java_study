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

            /*
            package datastructure.chap05.solution;

/*


A   3 5 2 7
S   5 7 7

1:  A[0] < A[1] -  S[0] = A[1]
2:  A[1] > A[2] -  1번인덱스 스킵
3:  A[2] < A[3] -  S[2] = A[3]
    A[1] < A[3] -  S[1] = A[3]


A   9 5 4 8
S  -1 8 8 -1

1: A[0] > A[1]  - 0번 스킵
2: A[1] > A[2]  - 1번 스킵
3: A[2] < A[3]  - S[2] = A[3]
   A[1] < A[3]  - S[1] = A[3]
   A[0] > A[3]  - 0번 스킵




import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Stack;
        import java.util.StringTokenizer;

// 백준 17298
public class 스택_오큰수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N]; // 수열 배열
        int[] S = new int[N]; // 정답 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 처음에는 스택이 비어있으므로 항상 최초값을 추가

        // 3 5 2 7    || 5 7 7 -1
        // 9 5 4 8
        for (int i = 1; i < N; i++) {

            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                S[stack.pop()] = A[i]; // 정답 배열에 오큰수를 저장
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            S[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int n : S) {
            sb.append(n).append(" ");
        }
        System.out.println(sb);


    }
}*/




