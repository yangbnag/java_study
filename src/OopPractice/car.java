package OopPractice;

public class car {

    // 필드 선언
    String model;
    String engine = "v6engine";

    // 상태속성 *자주 변하는 것들*
    boolean engineOn;
    boolean injector;
    boolean cylinder;
    int speed;

    // 생성자
    car() {
        model = "제네시스";
        engine = "ev6";
    }

    // 메서드
    // 엔진을 켜는 기능
    void engineOn() {
        engineOn = true;
        System.out.println(model + "의 시동을 켭니다.");
    }

    void engineOff() {
        engineOn = false;
        System.out.println(model + "의 시동을 끕니다.");
    }

    void cylinderMove() {

    }

    void injector() {
    }


    void showStatus() {
        if (!engineOn) {
            System.out.println(model + "의 시동을 켜세요");
            return;
        }
        System.out.println("\n# 자동차의 상태");
        System.out.println("모델명: " + model);
        System.out.println("엔진명: " + engine);
        System.out.println("최고속력: "  + speed);

    }

}


