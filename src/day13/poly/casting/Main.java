package day13.poly.casting;

public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();
        parent.m2(); // 부모의 원본 메서드 출력

        System.out.println("=============\n");

        Parent child = new Child();
        child.m1();
        child.m2(); // 자식이 오버라이딩한 메서드 출력

        ((Child)child).m3(); // 다운캐스팅을 통해 자식메서드 사용


// m1 = 부모 메서드
// m2 = 부모 메서드 , 자식이 오버라이드
// m3 == 자식 메서드
    }
}
