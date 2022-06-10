package day13.poly.basic;

class A{}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

// 자바는 다형성을 위해 객체들의 부모타입변환을 허용하고 있습니다.
//즉, 부모 타입에 모든 자식 객체를 대입할 수 있습니다.
public class Ploy {
    public static void main(String[] args) {

        A a = new A(); // A 클래스를 생성하려면 a의 타입은 A가 된다.
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        a = b;

        A x1 = b;
        A x2 = new B(); // B클래스의 객체를 생성하는데 A 타입으로 담을수 있다.
        A x3 = c;
        A x4 = new D();
        A x5 = e;

        B y1 = new D();
        C y2 = new E();

//        B y3 = new E();  // 상속 관계가 아니면 다형성이 적용되지 않음
        // D y4 = new E();



        double dd =3.3;
        int nn = (int)dd;
        dd = nn;

       Object z1 = new E(); // z1이 가질수 있는 타입은 4가지 E - C - A - Object

        // B z2 = new A(); // 부모 객체가 자식타입을 가질 수 없음.


    }
}
