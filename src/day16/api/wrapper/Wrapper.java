package day16.api.wrapper;

    // 기본 타입만 썼을 때의 문제점을 파악해야 함.
public class Wrapper {
    public static void main(String[] args) {

        // 모든 객체는 Object와 상속 관계를 가지기 때문에 가능한 문법.
        Object[] arr = {10, 2.2}; // 기본 타입은 불가능한 표현이지만 Wrapper class가 가능하게 한다.
                       // 10은 오토박싱 기능으로 생성된 Integer 타입 이다.

        Integer n = 10; // int가 객체화 된 class

        // 왜 객체인데 생성자로 객체를 만들지 않는 것인가?
        // String도 마찬가지로 오토박싱
        // 자바에서 자주 사용하는 객체들의 생성자 호출을 무시 하도록 허락.
        Integer n1 = new Integer(10); //
        String s = new String("");//

        System.out.println(Integer.MAX_VALUE);
        // int의 끝값을 알고 싶을때, 기본타입인 int는 변수 하나만 저장 할 수 있는데 Integer 클래스로 가능한 기능능
        // int의 초기값은 0, Integer의 초기값은 null/ 왜? 객체 이기 때문에


//        int m = n.intValue(); // 원래 이렇게 해서 Integer를 int 변수에 담아야 하지만!
        int m = n;  // 오토 언박싱으로 wrapper 클래스는 생략 가능.

    }
}
