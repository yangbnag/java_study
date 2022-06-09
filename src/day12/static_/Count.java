package day12.static_;

public class Count {
    // 필드
    public int x; // 인스턴스 필드
    public static int y; // 정적 필드

    // 메서드
    public void m1(){ // 제한자x - 인스턴스 메서드

        System.out.println("x = " + this.x); // x는 this 성립
        System.out.println("y = " + y); // y는 this가 성립이 안됨. 클래스별 하나만 존재 하기 때문에

        m2(); // 사용 가능
    }

    // static 블록(메서드, 정적 초기화자) 에서는
    // static 필드, 메서드만 직접 참조 가능
    // static 블록은 this를 사용할 수 없음.
    // static 필드는 객체별 존재가 아닌 클래스별 하나만 존재
    public static void m2(){ // static - 정적 메서드
        Count c = new Count();
        // static 메서드 에서 필드를 참조하기 위해서는
        // 메서드안에서 생성자를 직접 만들어서 어느 객체의 필드인지 정확히 적어줘야함.

        System.out.println("x = " + c.x); // 정적 메서드에서 x참조에 문제가 발생
        // static은 객체 생성 없이 사용이 가능함. 객체생성 없을 x의 객체가 없다.
        // Count.m2() 로 static 메서드를 호출할때 x가 누구인지 알수 없음.

       System.out.println("y = " + y);

//       m1(); // 사용 불가능 - static메서드는 static메서드만 사용 가능능
    }
}
