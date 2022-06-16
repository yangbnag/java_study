package day17.generic;

public class Main {
    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();

        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());

        // 각 과일에 맞는 바구니 클래스를 매번 만들어줘야 하는 번거로움.
        // 바스켓 클래스를 하나만 만들어 놓고 원할때 마다 원하는 과일을 담을
        // 바구니를 복제해서 만들어주는 회사와 연계 하는 것이 제네릭의 시작

        Basket basket = new Basket();
        basket.setFruit(new Banana());
        basket.setFruit(new Apple());

        Basket<Apple> ba = new Basket<>(); // 지금 내가 주문한 바구니는 사과전용 바구니 입니다.
        // 라고 바구니 회사에 이야기를 하여 사과바구니 클래스를 만든다.
        ba.setFruit(new Apple()); // 바나나를 담을수 없고 사과만 담을수 있다.

        Apple a1 = ba.getFruit(); // 사과 리턴

        Basket<Banana> bbb = new Basket<>(); // 바나나만 담을수 있는 전용 바구니
        bbb.setFruit(new Banana());
        Banana b1 = bbb.getFruit();

        Basket<Grape> gb = new Basket<>(); // 새로 만든 포도 클래스에 맞는 바구니클래스 별도 생성 필요 x
        gb.setFruit(new Grape());
        Grape g1 = gb.getFruit();

//        Basket<Toy> tb = new Basket<>(); // 장난감 바구니가 되었다.
        // 하지만 장난감 바구니로 사용되는 것을 원하지 않는다.
        // 과일 바구니로만 제한 하고 싶다면?


    }
}
