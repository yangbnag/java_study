package datastructure.chap07.radix;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 기수 정렬
public class RadixSort {

    //radix sort
    public static void sort(int[] arr) {

        // queue에 넣었다 뺐다 하는 횟수를 정하는 배열의 최대 자리수 구하기
        int digit = 0;
        for (int n : arr) {
           int len = String.valueOf(n).length();
           if(len > digit) {
               digit = len;
           }
//            System.out.println(digit);
        }
        // 각 자리수 숫자에 맞는 큐 10개 생성 - 순서대로 빼기 위해 큐 사용
        Queue<Integer>[] queues = new Queue[10]; // queue 배열 생성
        for (int i = 0; i < queues.length; i++) {
            queues[i] = new LinkedList<>(); // queue 배열에 10개의 큐 생성
       }

        /*
           1회차 루푸(i==0)에서는 각 숫자의 1의 자리수를 뽑아서
           위치에 맞는 큐에 삽입해야 함.

           2회차 루푸(i==1)에서는 각 숫자의 10의 자리수를 뽑아서
           위치에 맞는 큐에 삽입해야 함.

           3회차 루푸(i==2)에서는 각 숫자의 100의 자리수를 뽑아서
           위치에 맞는 큐에 삽입해야 함.
         */

        for (int i = 0; i < digit; i++) {
            for (int j = 0; j < arr.length; j++) {
            /*
            753 일때
            i = 0 일때는  3 뽑아야함
            i = 1 일때는  5 뽑아야함
            i = 2 일때는  7 뽑아야함

            753 / 1 % 10 ==> 3
            753 / 10 % 10 ==> 5
            753 / 100 % 10 ==> 7

            target / 10^i %10
             */
            int n = arr[j] / (int)Math.pow(10,i) % 10; // n은 ex) 753의 1의 자리수인 3 or 10의 자리수인 5 ..

            // 해당 자리수에 맞는 큐에 저장
            queues[n].add(arr[j]);
            } // end inner for(arr)

            // queue에서 순서대로 poo 하여 배열에 다시 저장
            int k = 0; // 배열 저장 위치 인덱스
            for (Queue<Integer> q : queues) {
                while(!q.isEmpty()) {
                    arr[k++] = q.poll();
                }
            }

        } // end outer for(digit)

    }

    public static void main(String[] args) {

        int[] arr = {753, 427, 450, 422, 220, 125, 332, 339, 1990, 660};

        sort(arr);
        System.out.println("정렬 후: " + Arrays.toString(arr));
    }
}
