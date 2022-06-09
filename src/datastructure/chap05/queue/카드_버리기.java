package datastructure.chap05.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드_버리기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 큐 생성
        Queue<Integer> que = new LinkedList<>();

        // 정수 n
        int n = sc.nextInt();

        // 큐에 n만큼의 정수 넣기
        for (int i = 1; i <= n; i++) {
            que.add(i);
        }
//        System.out.println(que);

        while(que.size() != 1) {
            int poll = que.poll();
            int remove = que.poll();
            que.add(remove);
//            System.out.println("poll : " + poll + ", remove : "+ remove);

        }
        System.out.println(que.peek());

    }







}
