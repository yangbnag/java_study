package day15.inter;

public class Tiger extends Animal implements Wild{
    @Override
    public void eat() {

    }

    @Override
    public void hunt(String target) {

    }

    @Override
    public void attack(String target) {

    }
    // Violent(폭력적)이거나 Huntable(사냥)을 할수 있거나
    // 둘중에 하나만 선택할 경우가 있어서 나누어 놨는데
    // Wild 라는 인터페이스를 만들어 Violent 인터페이스와 Huntable 인터페이스를 다중 상속!

}
