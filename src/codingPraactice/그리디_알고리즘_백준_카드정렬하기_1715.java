package codingPraactice;

import java.util.*;

// 백준 1715
public class 그리디_알고리즘_백준_카드정렬하기_1715 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 카드 묶음 수

        // 우선순위 큐 : 데이터가 삽입될 때 자동 오름차 정렬된다
        PriorityQueue<Integer> cardList = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            cardList.add(sc.nextInt());
        }

        int total = 0;

        while (cardList.size() != 1) {
            int data1 = cardList.poll();
            int data2 = cardList.poll();
            total += data1 + data2;
            cardList.offer(data1 + data2);
        }
        System.out.println(total);


    }

}