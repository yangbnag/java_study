package day12.static_;

// static 사용 예시

public class Calculator {
    public String company; // 제조사 (계산기 마다 제조사가 달를수 있다.) // static 사용 x

    public String color; //색상 (계산기 마다 색상이 다를수 있다.) // static 사용 x

    public static double PI; //원주율 (계산기 마다 원주율이 다를수 없다.) // static 사용하는 것이 좋다. 메모리 효율 변동없는 값이기 때문에

    // static initializer : 정적 초기화자
    // static 데이터의 초기화를 담당 (생성자는 인스턴스 필드의 초기화를 담당)
    static {
        System.out.println("정적 초기화자 호출!");
        PI = 3.14159;
    } // 객체 생성없이 사용할 경우 초기값 설정
    // 초기 1회만 호출 되고 값 고정

    // 생성자
    public Calculator(String company, String color){
        this.company = company;
        this.color = color;
        this.PI = 1;
    }

    // 메서드

    public void 색상을_입히다(String Color){ // 어떤 계산기에 색상을 입힐것인가? -> static 사용 x
        this.color = color;
    }

    public static double 원의_넓이를_구하다(int r){ // 어떤 계산기든 반지름만 구해주면 된다. -> static 사용!
        return PI * r * r;
    }

    public static void main(String[] args) {

        Calculator.원의_넓이를_구하다(5);
        // new Calculator로 객체를 만들어줄 필요가 없다.
        // 어떤 계산기든지 수행할 수 있는 메서드
        System.out.println("원주율: " + Calculator.PI); // 생성자에서 초기화 했기 때문에 객체를 안만들면 기본값이 들어가있네
        System.out.println("원주율: " + Calculator.PI); // 정적 초기화자는 한번만 호출
        System.out.println("원주율: " + Calculator.PI);
        System.out.println("원주율: " + Calculator.PI);
        System.out.println("원주율: " + Calculator.PI);

        Calculator sharp= new Calculator("삼성","회색");

        sharp.색상을_입히다("red"); // 어떤 계산기를 색칠해야 하는지 알수 없음
        // 객체를 정해야 한다.
        System.out.println("원주율: " + Calculator.PI); // 생성자로 초기화 해도되나?



    }


}
