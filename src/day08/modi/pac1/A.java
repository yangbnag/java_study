package day08.modi.pac1;

public class A {
    //필드 선언
    public int f1; // filed 선언시 타입 앞에 접근 제한자를 붙여야 한다.
    int f2; // 아무것도 안붙이면 default 제한
    private int f3;

    //메서드 선언
    public void m1(){}
    void m2(){}
    private void m3(){}

    public A() {
        f1 = 10;
        f2 = 20;
        f3 = 30;
    }
    // 자기 클래스 안에서는 접근 제한이 없다. 필드, 메서드 모두 해당됨

    B b1 = new B("s");
    B b2 = new B(1);
//    B b3 = new B(5.5); // 접근제한자 private

}
