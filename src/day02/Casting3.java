package day02;

public class Casting3 {
    public static void main(String[] args) {

        // 타입이 작은 데이터의 연산에서는
        // 작은 쪽을 큰 쪽으로 변환한 후 연산을 진행

        int a = 10;
        short b = 30;
        int c = a + b ; // a와 b의 타입은 다르고 원래는 연산이 불가능!!
                        // 안정적인 형태로 변환한 후 연산.! (업캐스팅) -> 자바에서 b에 (int)를 넣어 자동 형변환을 진행 함

        char d = 'A'; // 2byte
        int e = 2; // 4byte
        System.out.println(d+e); // char의 업캐스팅 int로 형변환시 숫자 65가 되고
                                // int d = 65, int e = 100 -> d+e = 165 가 된다.

        // 문자열 + 숫자 = 문자열
        // 단일문자 + 숫자 = 숫자
        
        char f =(char) (d+e); // 'A' char의 단일문자로 연산시 숫자 변환 65 -> 65+2 = char 67;
        System.out.println("f = " + f);
        // 만약 A2로 출력 하고 싶다면
        // int e = 2; -> String e = "2"; 로 변경 하고
        // char f = (char) (d+e); -> String f = (d+e); -> 문자열 + 숫자열 = 문자열 A2

        System.out.println(3.0+5); // 8.0 업캐스팅

        /*
         int 보다 작은 데이터(byte, short, char) 끼리의 연산은
         결과가 자동으로 int로 변환되어 처리
         (스택 오버플로우, 언더플로우 방지)
         */
        byte b1 = 100;
        byte b2 = 120;

        int result = b2 + b1; // 곱하기 연산 으로 byte의 범위가 넘을수 있다.

        System.out.println('A' + 'B'); // 131 //'char' 단일문자
        System.out.println("A"+"B"); // AB // "String" 문자열

        // 문자열 + 숫자 = 문자열
        // 단일문자 + 숫자 = 숫자



        
    }
}
