package day01;

public class Variable {
    public static void main(String[] args) {
        // 변수의 선언(타입 지정)
        int score; // 정수 타입 -> int (자바는 변수 타입을 직접 지정)

        // 변수의 초기화

        score = 70; // int 변수에 숫자 대입은 가능하지만 문자 타입은 불가능
        //socre = 'zzz';
        // 실수도 저장 되지 않음.
        System.out.println(score);

        int Life = 3;
        Life = 5; // 변수 값 변경

        System.out.println(Life);

        int triple = score * 3; // 변수 값에 기존 변수의 수식 가능
        System.out.println(triple);
        System.out.println("triple = " + triple); //soutv
        
        // 정수 : int, 실수 : double, 문자열 : String
        
        String nickname = "짹짹이";
        System.out.println("nickname = " + nickname);

        //nickname = 5.5; 변수 타입과 다른 값은 저장 불가

//        double score = 3.3; // 같은 범위 안에선 같은 변수 이름을 쓸 수 없음. (중복된 변수 선언 불가.)

        String 홍길동 = "홍길동";// (값을 먼저 써놓은 후) ctrl + alt + v 자동 변수 선언  
        
        int i = 100;

//        double random = Math.random();
    }
}
