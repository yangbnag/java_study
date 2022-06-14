package day15.inter;

public class Rabbit extends Animal implements Pet, Violent{
    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }

    @Override
    public void attack(String target) {

    }

    // 기능은 구현되나 구체적이지는 않다.
    // 객체별로 오버라이딩하여 구체적으로 만들어 사용
}
