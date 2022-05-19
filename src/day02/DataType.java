package day02;

public class DataType {
    public static void main(String[] args) {

        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 2147483648L; // long 타입은 저장 범위가 넓다. 리터럴에 저장되는 값의 타입은 int
        // int 공간에 저장이 안되어서 범위가 벗어났다는 문제가 발생한 것이다.
        //


        // 실수타입 오차 검증
        int i;
        double n = 0.0;
        for(i = 0; i<100; i++) {
            n += 0.1;
        }
        System.out.println("n = " + n);

        //실수 타입
        float f1 = 1.2345678901234F; //4byte // 실수 타입의 리터럴 타입은 double 이다.
                                     // 리터럴 값 float 으로 변경
        double d1 = 1.2345678901234; // 8byte

        System.out.println("d1 = " + d1);
        System.out.println("f1 = " + f1);

        // 논리 타입  (자바스크립트와 다르게 오직 true와 false만 사용 가능!)
        boolean b1 = true;
        boolean b2 = false;

        // 문자 타입
        // 기본 타입 : char
        // 2byte 할당, 음수개념 x, 글자 1글자만 저장 가능
        
        char c1 = 'A'; // 자바에서 한글자만 char에 저장할때 '' 사용.
        char c2 = 44032; // 숫자를 입력하면 그 숫자에 맞는 유니코드가 출력.
        char A = 65; // 숫자를 입력하면 그 숫자에 맞는 유니코드가 출력.
        char A1 = 97; // 숫자를 입력하면 그 숫자에 맞는 유니코드가 출력.
        System.out.println("c2 = " + c2);
        System.out.println("A1 = " + A1);
        System.out.println("A = " +A );

        //문자열 타입 String
        //String은 기본타입이 아닙니다. 객체 입니다.

        String s1 = "hello!"; // String은 저장범위가 가변적임.
                              // hello 는 char가 5개 필요하고 10byte가 필요함.

        // 문자 + 숫자 = 문자
        System.out.println(s1 + 300 + 120);


    }
}
