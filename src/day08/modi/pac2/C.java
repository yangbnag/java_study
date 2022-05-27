package day08.modi.pac2;
import day08.modi.pac1.A;
import day08.modi.pac1.B;

public class C {
// 클래스에도 접근제한자를 선언할수 있다.
    // B클래스는 같은 패키지에서만 사용할 수있도록  제한하였다.
    // 메서드나 생성자의 제한이 public 일지라도 못씀!
    // 클래스 접근 제한은 public과 default만 사용 가능
    void test() {
        A a = new A(); // 패키지가 달라서 빨간줄 생김
    }

    B b1 = new B("s");
//    B b2 = new B(1);
//    B b3 = new B(5.5); // 접근제한자 private

}
