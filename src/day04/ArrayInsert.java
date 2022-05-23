package day04;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr = {50, 150, 200, 250, 300};

        int newNumber = 100; // 신규 삽입데이터
        int targetIdx = 1; // 삽입 위치
        System.out.println("삽입 전: " + Arrays.toString(arr));

        //1. arr의 length보다 1개 더 큰 배열을 만든다.
        int[] temp = new int[arr.length + 1];

        //2. 새로운 배열에 데이터 복사
        /*
        temp[5] = arr[4];
        temp[4] = arr[3];
        temp[3] = arr[2];
        temp[2] = arr[1];
        temp[1] = newNumber;
        temp[0] = arr[0];
*/
        //2-1 패턴 찾기
        for(int i = 0; i<temp.length; i++) {

            temp[temp.length-(i*1)] = arr[arr.length-(i*1)];

            // 삽입 위치를 선정해서 새로운 데이터를 넣어야 함.
        }

        //3. arr에 추가된 배열 주소 등록 후 새로만든 배열 주소 삭제
        arr = temp; temp = null;


        //50, 100, 150, 200, 250, 300
        System.out.println("삽입 후: " + Arrays.toString(arr));
    }
}
