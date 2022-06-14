package day15.inter;

import java.util.LinkedList;
import java.util.List;

// 인터페이스 활용 Main
public class Main {
    public static void main(String[] args) {

        //객체 생성
        // 인터페이스도 다형성을 적용할 수 있다.
        Dog dog = new Dog();
        Cat cat = new Cat();
        Shark shark = new Shark();
        Tiger tiger = new Tiger();
        BullDog bullDog = new BullDog();
        Rabbit rabbit = new Rabbit();

        // 애완동물 모여라 하면 Pet[]
        Pet[] pets = {dog, cat, bullDog, rabbit};

        for (Pet pet : pets) {
            pet.play();
        }

        // 폭력적인 애들만 모여 Violent[]
        Violent[] violents = {rabbit, tiger, shark};
        for (Violent v : violents) {
            v.attack("zzzz");
        } // 메서드 구체화 안해서 출력이 안되넹..

        // 인터페이스를 통해 객체의 기능을 제한할 수 있다.
        Rabbit tokki = new Rabbit();
        tokki.play();
        tokki.attack("주인");

        // 토끼가 놀기도 하면서 주인을 때린다...
        // 토끼를 교육해서 주인을 때리지 않도록 한다면
        // 타입을 Pet으로 변경
        // 토끼를 야생으로 풀어놓으면 Violent 타입으로 변경


        List<Integer> list = new LinkedList<>();
        // LinkedList queue 등의 인터페이스로 기능 추가 제한.
        // 더 상세하게는 나중에 이해 하고나서..

        // 혼동 하지 말자
        // 인터페이스는 상속이 가능하고 기능만 내린다.
    }
}
