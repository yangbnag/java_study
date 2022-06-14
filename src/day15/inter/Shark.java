package day15.inter;

// 상어 클래스를 처음 만들때 인터페이스를 활용
public class Shark implements Pet, Huntable, Violent {
    // 상어는 애완동물의 성질 + 사냥꾼 성질 + 폭력적인 성질이 있다.
    // 인터페이스는 상속에서 불가능하던 다중 상속이 가능하다.

    // 기본적으로 필요한 기능들이 구현되었다.
    @Override
    public void hunt(String target) {

    }

    @Override
    public void play() {

    }

    @Override
    public void attack(String target) {

    }


}
