package day12.static_;

public class Main {
    public static void main(String[] args) {


//        System.out.println(Count.x); // 객체 생성 없이 접근 불가
        System.out.println(Count.y); // static은 객체 생성 없이 접근 가능
        System.out.println(Math.PI); // static
        // 생성자가 private 이므로 new Math() 불가능.


        // x의 값을 참조하고 싶다.

       Count c1 = new Count();
       c1.x = 10;
       c1.x++;

       // y의 값에 20을 넣고 싶다.
        Count.y=20;
        // y의 값을 하나 내리고 싶다.
        Count.y--;

        // static의 접근은 클래스 이름. 으로 접근한다.


        // 새로운 객체 c2의 필드는 기본값으로 설정 되어 있기 때문에 x, y가 0으로 나올 것으로 예상
        // 하지만 y는 19 이다;
        Count c2 = new Count();
        c2.x = 100;
        Count.y = 200;
        // c2의 y만 바꾸려고 했는데 c1의 y도 200으로 초기화 되었다.
        // static은 고정 count 생성자로 100개의 인스턴스를 만들어도 y는 1개, (x는 100개)

        System.out.printf("c1.x: %d, c1.y:%d\n", c1.x, Count.y);
        System.out.printf("c2.x: %d, c2.y:%d\n", c2.x, Count.y);

        System.out.println("=======================================");

        c1.m1(); // m1 메서드를 실행하기 위해서는 객체가 필요하다. ex) 달리다() 라는 메서드만 있으면 누가 달리는지 알수 없다.


    }
}
