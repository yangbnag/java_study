package day08.modi.pac1;

public class B {
// B 클래스에 있는 public 제거

    //B클래스에서 생성자 3개 생성
    //오버로딩 조건 : 매개변수의  타입,순서 개수가 달라야함.
    public B(String s){}
    B(int x){}
    private B(double z){}

    B b1 = new B("s");
    B b2 = new B(1);
    B b3 = new B(5.5);


    void test() {

        A a = new A();
        //B 클래스는 는 A클래스와 같은 패키지 소속

        a.f1 = 10; // f1의 접근제한자는 public
        a.f2 = 20; //f2의 접근제한자는 default
//        a.f3 = 30; // f3의 접근 제한자는 private
        // private는 해당 클래스에서만 사용 가능하다.

        a.m1(); //public
        a.m2(); // default
//        a.m3(); // private
    }


}
