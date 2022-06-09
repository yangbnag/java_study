package day12.final_;

// 한 파일에 클래스를 여러개 선언할수 있으나 파일명과 똑같은 클래스만 public 제한을 걸수 있다.

class Child extends Parent{
    void m4(){}

}



//public final class Parent {
public class Parent {
    final void m1(){} // 엄마가 기능을 다 상속해줄테니 m1 메서드는 건드리지 말아라! (오버라이딩 제한한)
    void m2(){}
    void m3(){}

}


// final을 붙였다 = Parent 클래스 자체는 완벽하다. 더이상 건드리지 말아라! 라는 의미.
// 상속받은 클래스가 오버라이딩 해서 기능을 변경할수 있기 때문에
// 클래스의 확장을 막겠다.!
