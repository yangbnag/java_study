package day14.abs.pet;

public class GoldFish extends Pet {
    // Pet 추상 클래스는 오버라이딩을 강요한다.

    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void feed() {

    }

    @Override
    public void takeNap() {

    }
}
