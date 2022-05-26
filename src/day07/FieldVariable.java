package day07;

public class FieldVariable {
    String a; // a는 field

    void m1(int c) { // c는 parameter
        int b = 1; // b는 local variable
        System.out.println("a = " + a);
        System.out.println("b = " + b); // 지역변수 b
        System.out.println("c = " + c);

        // a,c 도 초기화를 안시켰는데 왜 b 한테만 그러는건가..

        /*
        - 지역변수는 반드시 초기화가 되어 있어야 참조가 가능합니다.
        - 필드는 초기화를 하지 않아도 각 타입의 기본값으로 초기화 됩니다.
        - 매개변수는 메서드 호출시 강제로 값이 대입되므로 따로 초기화 할 필요가 없습니다.
        */

    }

    public static void main(String[] args) {
        // 빠른 실행을 위해 main을 만들었다.
        FieldVariable fv = new FieldVariable();// 객체생성;
        fv.m1(10);

        // 위에서 만든 m1 변수 a,b,c를 출력하는 메서드(함수)를 실행 하려고 한다.
        // m1에 빨간줄이 그어진 것은 매개변수를 입력하지 않았기 때문에.
        // 빨간줄이 안지워지는 것은 static을 사용하지 않아서... 객체의 메서드로 사용하려면 객체를 생성!

        //출력된 값 c가 10인 이유는 매개변수 10을 넣었기 때문에 b는 메서드에서 int b=1;을 설정 했기 때문에
        // a는 왜 0이지?
        // 필드는 초기화를 하지 않아도 각 타입의 기본값으로 초기화 되기 때문에.
        // a 타입이 String 이었으면 출력은 ?
        // 초기값은 기본데이터타입 8개를 빼고 다 null 이다.

        // 왜 필드는 초기화를 하지 않을때 기본값으로 출력 될까?
        // 지역변수는 stack에 저장됨 b,c / a는 Heap에 동적할당 된다. Heap 저장될때 기본값으로 저장.
        // a는 전역변수로 사용 할수 없고, b도 지역변수 이므로 main 클래스에서 사용 불가
//        System.out.println(b);
    }


}
