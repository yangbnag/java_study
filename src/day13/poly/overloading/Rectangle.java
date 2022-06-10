package day13.poly.overloading;

public class Rectangle {

    // 정사각형의 넓이를 구하는 기능
    // calcArea(int)
    public int calcArea(int len) {
        return len * len;
    }

    // 직사각형의 넓이를 구하는 기능
    // calcArea(int, int)
    public int calcArea(int w, int h) {
        return w * h;
    }

    //calcArea(double)
    public double calcArea(double abce) {
        return abce*abce;
    }

    // 매개변수의 순서가 다르면  타입이 같아도 사용 가능.
    // 접근제한자와 리턴 타입과는 무관하다.
    // 외부에서 호출할때 구분 (호출할때 매개변수에 인수 타입으로 구분)


}
