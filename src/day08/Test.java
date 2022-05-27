package day08;

import day08.fruit.Apple;
import day08.fruit.Banana;
// Apple 사용시 주소값


public class Test {
    public static void main(String[] args) {
        // 사과 객체를 만들고 싶다.
        Apple apple = new Apple();
        new Banana(); // 다른 패키지에 있는 클래스를 선언할때
                     // 클래스 주소를 표기 해야함.


        // 많은 수의 객체 사과를 만들고 싶을 때 보기가 불편하네..
    Apple appleSyrup = new Apple();

    }
}
