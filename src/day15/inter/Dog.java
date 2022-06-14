package day15.inter;

public class Dog extends Animal implements Pet {
    @Override
    public void play() {
        System.out.println("강아지는 꼬리를 흔들며 놓아요~");
    }

    @Override
    public void eat() {
        System.out.println("개밥을 먹는다.");
    }
    // public class Dog extends Pet = 상속시
    // 구현 클래스가 인터페이스를 구현할 때는 implements 키원드 사용
}
