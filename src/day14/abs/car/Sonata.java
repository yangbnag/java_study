package day14.abs.car;

public class Sonata extends Car{
    @Override
    public void accel() {

    }

    @Override
    public void brake() {

    }

    // Car의 기본 기능인 가속, 감속 기능을 안만들었는데도
    // 아무런 메시지를 보내지 않는 것을
    // 막는 것이 추상 클래스 이다.
    // 다시 한번 강조조
}
