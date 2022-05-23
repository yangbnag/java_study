package day04;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {
        //배열 데이터 추가 알고리즘
        int[] arr = {10, 20, 30};
        int newData = 40;
//        arr.push(40); // 자바스크립트에서 쓰던 push 기능을 사용하고 싶다..

        // 1. 원본배열보다 사이즈가 1 큰 새로운 배열 생성
        int[] temp = new int[arr.length + 1];

        // 2. 원본배열의 데이터를 새로운 배열에 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        // 3. 추가할 데이터를 마지막 인덱스에 추가
        temp[temp.length - 1] = newData;

        // 4. 주소값 이전
        arr = temp;
        temp = null;

        // 우리는 원본 arr에 40을 추가 하고 싶었는데 사본 배열 temp에 40이 추가 되었음 ㅠ
        //  temp 주소를 arr에 넣어주고 temp 주소를 초기화 하면 된다.

        System.out.println("원본배열: " + Arrays.toString(arr));
        System.out.println("사본배열: " + Arrays.toString(temp));
    }
}
