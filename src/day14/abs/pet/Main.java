package day14.abs.pet;

import utility.Util;
public class Main {

    public static void main(String[] args) {
        // abstract 를 사용하면 new pet 기능이 막힌다.
//        new pet();


        Pet dog = new Dog("초코","푸들",3);
        Pet cat = new Cat("냥냥이","러시안블루",2);

        dog.feed(); // 다른 개발자가 실행시
        dog.takeNap(); // 필수 기능들을 오버라이딩 하여 설계하지 않았음.

        cat.feed();
        cat.takeNap();

   // 추상 클래스를 사용하여 위와 같이 공통적으로 적용되는 필수 기능들의 오버라이딩을 강요할 수 있다.

    }

}
