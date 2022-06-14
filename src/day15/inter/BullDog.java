package day15.inter;

// 불독 만들기
public class BullDog extends Dog implements Pet, Huntable {
    @Override
    public void hunt(String target) {

    }

    // Dog의 기능을 상속 받으면서 사냥 기능도 바로 부여할수 있다.

    // 필드 상속이 필요하면 추상클래스를 사용
    // 인터페이스는 필드가 상수 이기 때문에
}
