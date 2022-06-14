package day15.inter;

public class Cat extends Animal implements Pet {

    @Override
    public void play() {
        System.out.println("고양이는 캣타워에서 혼자 놀아요");
    } // 추상 클래스처럼 오버라이딩이 강요되는 것을 확인 할 수 있다.

    @Override
    public void eat() {

    }

    // 모든 애완동물은 놀아야 된다. true
    // 모든 애완동물은 카테고리화 하다보면
    // 온순한 동물이 있고, 사납거나 무서운 동물이 있다.
    // 이럴때 인터페이스 이용
}
