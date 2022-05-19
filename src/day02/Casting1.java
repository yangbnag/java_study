package day02;

public class Casting1 {
    public static void main(String[] args) {
        byte a = 100; // 1바이트 할당

                int b = a; // a가 int로 자동 형 변환 (묵시적 형변환)

        double c = b; // 실수형 타입 c에 정수형 타입 b를 저장 하려고 함.
        System.out.println("c = " + c);// b를 double로 자동 형변환 하여 c에 저장
    }
}
