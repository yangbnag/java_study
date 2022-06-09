package day12.static_.singleton;

public class Main {

    public static void main(String[] args) {

        Controller c1 = Controller.getInstance();
        Controller c2 = Controller.getInstance();
        Controller c3 = Controller.getInstance();
        // 직접적으로 생성하는 것이 막혔다.

        c1.number = 100;
        c2.number = 200;
        c3.number = 300;

        // 인스턴스 3개 생성
        // 모두 다른 주소를 가진 Controller 객체들이 싱글톤 패턴으로 같은 주소를 가지게 된다.
        System.out.println("c1 = " + c1.number);
        System.out.println("c2 = " + c2.number);
        System.out.println("c3 = " + c3.number);
    }



}
