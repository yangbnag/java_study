package day17.generic;

// 객체 생성 전까지 Basket의 용도를 모른다.
// 제네릭 클래스 : 객체가 생성될 때 타입이 결정됨.
// 제네릭 클래스는 타입의 안정성을 제공.

public class Basket<F extends Fruit> { // 제네릭 타입 선언, 현재까지 무슨 타입인지 알수 없다.
    // Fruit 클래스를 상속 받는 클래스들만 F 타입 사용 가능.

    // 필드 선언 (추상적으로 선언)
        private F fruit; // 구체적으로 타입을 Apple 이라고 쓰지 않고, 아무 거나 써놓는다.
                         // F 타입의 제네릭 클래스. 현재 F 클래스는 작성되어 있찌 않다.


        public F getFruit() {
            return fruit;
        }

        public void setFruit(F fruit) {
            this.fruit = fruit;
        }


    }
