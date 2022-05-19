package day02;

public class RandomExample {
    public static void main(String[] args) {
        // 연산자 우선순위

        //난수 생성
        //0.0 <= ~ <1.0
        double rn = Math.random();
        System.out.println("rn = " + rn);
        // 1이상 10 이하의 랜덤 정수
/* 
Math.random() -> 0.0  <= ~ <  1.0
Math.random() * 10 -> 0.0 <= ~ <10.0

(int) (Math.random() * 10) -> 0 <= ~ < 10
(int) (Math.random() * 10 + 1 -> 1 <= ~ < 11
 */
       int num = (int) Math.random() * 10 + 1; // 랜덤 함수 괄호를 지우면 1만 나온다.
        // = 대입 연산자 / (int) 단항 연산자 / .참조연산자 / *10 2항 연산자 / +1 2항 연산자
        // 0.0 <= ~ < 1.0 실행 하면 (0)
        // 형변환 하면 ( int 0)
        // 0*10 = 0 // 0 + 1 = 1
        // Math.random() 에 곱하기 10을 하는 것보다 캐스팅이 빠르기 때문에
        // (int) (Math.random() * 10) + 1 괄호를 쳐서 우선순위를 변동해줘야 1~10 사이의 랜덤 정수가 나오게 된다.
        System.out.println("num = " + num);
    }
}



