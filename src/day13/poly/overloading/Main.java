package day13.poly.overloading;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        System.out.println(r.calcArea(5));
        // 메서드 이름으로 정사각형 구하는 메서드를 구분하기 어려움
        // 같은 메서드 이름에서 매개변수 구성을 다르게 하여 정사각형, 직사각형을 구할수 있도록 할 수 있다.
        System.out.println(r.calcArea(10,20));

        System.out.println();
    }
}
