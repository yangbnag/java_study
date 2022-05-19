package day02;

public class Practice_oprator {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x + 5 * 3;
        // 연산자 다 동그라미 =, ++ , + , *
        // ++,-- 무시
        // 곱하기 먼저 5*3 = 15
        // ++x + 15 -> ++과 + 중 앞에 붙은 ++ 먼저 적용한다. -> 4 + 15
        // x = 4, y = 19;
        int z = 5 * y-- + x++ - -- y;
        //연산자 다 동그라미 =, * , -- , + , ++ , - , --
        // (5 * y --) --가 뒤에 있으니까 5*19 한 후에 y값 19를 18로 내린다. (-- 가 y 앞에 있으면 y 18로 만든 후 5와 곱한다.)
        // (95 + x ++) -> 95 + 4 를 한후 x를 하나 올린다. x = 5;
        // (99 - --y) -> 18을 17로 바꾼 후 99-17 = 82 z = 82;
        // 단항 연산자 연습 x,y,z의 값 알아보기
        System.out.println("z = " + z);
        System.out.println("y = " + y);
        System.out.println("x = " + x);
    }
}
