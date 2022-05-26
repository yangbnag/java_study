package day06;

import java.util.Arrays;

public class MethodPractice {
    static String[] foods = {"떡볶이", "치킨", "파스타"}; // 전역변수 처럼 사용하기

    //printFoods배열의 내부데이터를 출력하는 함수
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    //foods 배열에 마지막위치에 데이터를 추가하는 함수 push()
    static void push(String newFood) {
        String[] temp = new String[foods.length + 1]; // 기존 배열보다 길이가 1 더큰 배열 생성
        // 새로운 배열에 기존 배열 데이터 복사
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = newFood; // 새로운 배열 마지막 인덱스에 추가된 음식 저장.

        foods = temp; // 주소값 변경 하여 foods를 새로운 배열의 조소와 연동 시키기.

    }

    //배열복사
    static void addCopy(String... newArr) {
        for (int i = 0; i < foods.length; i++) {
            newArr[i] = foods[i];
        }
    }

    static void delCopy(String... newArr) {
        for (int i = 0; i < foods.length - 1; i++) {
            newArr[i] = foods[i];
        }
    }

    //인덱스 맨끝 데이터 삭제 pop
    static void pop() {
        String[] temp = new String[foods.length - 1]; // 기존 배열보다 길이가 -1인 배열 생성
        delCopy(temp);
        foods = temp;
    }

    //indexOf배열의 인덱스를 탐색하는 함수
    static int indexOf(String targetFood) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(targetFood)) {
                return i;
            }
        }
        return -1;
    }

    //boolean 함수
    static boolean include(String food) {
        return indexOf(food) != -1;
    }

    //배열 중간 인덱스 삭제 함수
    static void remove(String targetName) {
        int targetIdx = indexOf(targetName);
        if (!include(targetName)) {
            System.out.println("존재하지 않는 음식명 입니다.");
            return;
        }

        for (int i = targetIdx; i < foods.length-1; i++) {
            foods[i] = foods[i + 1];
        }
        pop();
    }

    //insert 배열 중간에 데이터 삽입
    static void insert(int targetNum, String newFood) {
        String[]temp = new String[foods.length+1];
        addCopy(temp);
        for (int i = temp.length-1; i > targetNum ; i--) {
            temp[i] = temp[i-1];
        }
        temp[targetNum] = newFood;
        foods=temp;
    }

    //modify 배열 데이터 값 수정
    static void modify(int targetIdx, String mFood){
        foods[targetIdx] = mFood;
    }

    //clear 배열 데이터 초기화
    static void clear() {
        foods = new String[0];
    }


    public static void main(String[] args) {

        printFoods();
        insert(1,"추가된짜장면");
        printFoods();
        modify(1,"추가된짬뽕");
        printFoods();
        clear();
        printFoods();



    }//main end
} // class end