package day13.poly.basic.car;

import utility.Util;

public class Main {
    public static void main(String[] args) {
        // Car 클래스를 각 자동차 객체에 상속 시켜준 후
        // 그랜저 객체 3개 생성
        Car g1 = new Granduer();
        Car g2 = new Granduer();
        Car g3 = new Granduer();

        // 머스탱 객체 2개 생성
        Car m1 = new Mustang();
        Mustang m2 = new Mustang();

        // 스팅어 객체 2개 생성
        Car s1 = new Stringer();
        Stringer s2 = new Stringer(); // 타입을 자식 클래스로 해도 부모 클래스로 자동 업캐스팅이 된다.

        // 각 자동차 객체의 성능 테스트를 하고 싶다.
        Car[] cars = {g1, g2, g3, m1, m2, s1, s2};

        for (int i = 0; i < cars.length; i++) {
            cars[i].run();
            // 스팅어는 run의 원본 메서드가 출력 된다.
        }

        Object[] oArr = {
                10, 3.3, "하하호호", new Mustang()
        }; // 모든 객체들의 최상위 부모인 Object는 모든 타입을 담을수 있다. 하지만 비추천천

        System.out.println("================");

        Driver kim = new Driver();
        kim.drive(new Mustang());
        kim.drive(new Granduer());
        kim.drive(new Stringer());
        kim.buyCar("그랜져");

        Car myCar = kim.buyCar("그랜져");
        myCar.run();

        kim.buyCar("머스탱").run();//.dirve(); 불가능 run()의 메서드 리턴은 보이드이기 때문에
        new Driver().buyCar("스팅어").run();

        kim.drive(kim.buyCar("스팅어"));

        System.out.println("=======================");


        Mustang mm = new Mustang();
        Car cc = mm; // 업캐스팅

        System.out.println("mm = " + mm);
        System.out.println("cc = " + cc);

        // mm과 cc는 같은 객체를 바라보고 있다. 타입만 다를뿐이다.

        mm = (Mustang) cc; // 다운 캐스팅 // 업캐스팅은 형변환 명시 안해도 되지만 다운 캐스팅은 형변환 명시해야함.


//        Car ccc = new Car();
//        Mustang mmm = (Mustang) ccc; // 부모 객체를 자식 타입으로 변경 할수 없다. 위에서 이야기한 것은 데이터 타입

        // 자식객체가 부모타입으로 되었다가  다시 자식개체 타입으로 변경 시키는 것만 가능함.

        System.out.println("===========================================\n");

        Mustang myMs = (Mustang) kim.buyCar("머스탱"); // buyCar는 업캐스팅으로 Car 타입을 리턴한다.

        myMs.run(); // 자동 업캐스팅

        myMs.joinMustangClub(); // 타입이 부모인 Car 타입이기 때문에 머스탱에서만 실행되는 메서드가 작동되지 않는다.

        // * 메서드에서 상위 타입으로 리턴 받을때는 위에 처럼 다운캐스팅을 하여서 쓰는 것을 추천한다.

        Util.line();
        Util.line();
        Util.line();
        Util.line();
        Util.line();
        Util.line();

//        Util.inputD("정수");

        Util.line();

        CarShop shop = new CarShop();
        int money = shop.sellCar(g1);
        int money1 = shop.sellCar(s1);
        int money2 = shop.sellCar(m1);
        System.out.println(money);
        System.out.println(money1);
        System.out.println(money2);

        cast(m1);
String a = "gd";
a.equals("ad");
    }//end main

    public static void cast(Object o) {
        if(o instanceof String) { // 캐스팅 검사
            String s = (String) o; // 다운 캐스팅팅
            System.out.println("스트링 변환 성공!");
        } else
            System.out.println("변환 불가능!");
    } // 메서드 내부에서 강제 캐스팅을 할때는 검사를 하여 오류를 막아준다.

}
