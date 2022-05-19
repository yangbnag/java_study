package day02;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean t = true, f=false;
        System.out.println(t | t);
        System.out.println(t | f);
        System.out.println(f | t);
        System.out.println(f | f);

        System.out.println("=====================");

        int x = 10, y = 20;
       boolean result1 = (x != 10) && (++y == 21);
       boolean result2 = (x == 10) || (++y == 21); // | 일 때 y=22, || 일때 y = 20;
                                                    // 단축평가 좌항에서 결과가 판단되면 우항 연산을 수행하지 않음.
        // x =  10 이 true 이므로 ++y = 21 연산을 수행 하지 않고 true 결과 출력 하여 ++y가 실행되지 않음.

        // 단축평가
        /*
         true && true => true : 우항이 true 이면 좌항 true인지 확인 후 결과값 출력
         true && false => false
         false && true => false : 우항이 false이면 좌항 결과에 상관 없이 false 이므로 우항에서 연산 종료 후 결과 값 출력.
         false && false => false
        */
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("======================");

        //논리 반전(!) - 단항 연산자
        System.out.println(!t);

        System.out.println(10 + 20); // +는 산술 연산자
        System.out.println("안녕"+"하세요"); // +는 결합 연산자
        //논리 & 논리 -> 논리 연산자
        // 정수 & 정수 -> 비트 연산자 // 피연산자에 따라 연산자의 열할이 달라진다.



    }
}
