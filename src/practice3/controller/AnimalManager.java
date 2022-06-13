package practice3.controller;

import day08.modi.pac1.A;
import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;
public class AnimalManager {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Cat("냥냥이","길냥이","시장","검은색");
        animals[1] = new Cat("장화냥이","슈렉영화주인공","영화","주황색");
        animals[2] = new Cat("복냥이","만화주인공","점집","흰색");
        animals[3] = new Dog("백구","진돗개",5);
        animals[4] = new Dog("흑구","발발리",6);

        for (Animal a : animals) {
            a.speak();
        }
    }
}
