package day03;

public class Loop02 {
    public static void main(String[] args) {
        apple : for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                if (lower == 'f') break apple; // break는 제일 가까운 반복문 탈출
                // 안쪽 브레이크로 바깥쪽 for문도 탈출하고 싶을때 (label 기능)
                System.out.printf("%c - %c\n", upper, lower);
            } //inner for
            if (upper == 'D') break;
        }//outer for
    }
}
