package day10.encap;

public class Main {
    // 정보 은닉을 하지 않았을경우 발생하는 문제점 살펴보기
    public static void main(String[] args) {

    Car myCar = new Car("그랜져"); //myCar 객체 생성(인스턴스)
    // 외부 클래스인 main에서 myCar 객체에 필드 값에 접근이 가능핟.

//        myCar.speed = 30000;
//        System.out.println("현재속도: " + myCar.speed);

        // 속도가 3만으로 설정 되었다. 외부 접근자에 의해서 속도 값을 변경되게 해서는 안된다.
        // 필드 접근제한 private 으로 설정하면 위에 문제 해결
//        System.out.println("현재속도: " + myCar.speed);
        // 하지만 여기서 문제가 발생... 관리자도 참조, 값변경이 안되게 된다.

        //해결방법 -> 정상적인 범주의 필드값은 수정이 가능하도록 대리인을 설정 한다.//
        // 제어문은 메서드 안에서만 사용 가능. 제어문을 쓸수 있는 대리인 메서드 //

        myCar.setSpeed(60000); // 변경 하고 확인 하려고 했더니 참조도 안되네?
        System.out.printf("현재 속도: " + myCar.getSpeed()); // 참조하는 대리인도 만들어라 getter

        myCar.setMode('D');
        System.out.println("현재 모드: " + myCar.getMode());
    }

}
