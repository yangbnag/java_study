package day11.protec.pac1;

public class A {

    protected int f1; // protected 제한
    int f2; // default 제한

    protected void m1(){};
    void m2(){}; // default 제한

    public A(){} // 기본생성자
    protected A(int a){} // 기본생성자
    A(double b){} // 기본생성자
}
