package day02;

public class Casting2 {
    public static void main(String[] args) {

        // downcating : 하위 타입 변환

        // 0011 1110 1000 -> 10진수 1000을 이진수 변환
        int n = 1000;
        byte m = (byte) n; // n = int, m = byte; // 상위 타입변환 처럼 자동 형변환을 했을 경우 버리는 데이터가 발생.

        System.out.println("m = " + m); // -24가 출력 되는 이유는?
                                        // 다운캐스팅시 값의 손실이 일어날 수 있음.
        
        double k = 5.556;
        int j = (int) k; // (int) 는 형변환 연산자 이며 단항 연산자 이다.
        System.out.println("j = " + j); // 데이터 소실을 활용한 명시적 형변환 (소수점을 버리고 싶을때)

    }
}
