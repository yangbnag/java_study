package day13.poly.basic.car;

public class CarShop {

    // 차를 판매하는 기능
    public int sellCar(Car car) {
        // 메서드 내부에서 어떤 객체가 들어왔는지 알아야
        // 해당 차에 대한 가격을 리턴해준다.
        if(car instanceof Granduer) { // 좌항 변수 우항 타입
            return 2000;
        } else if (car instanceof Mustang) {
            return 3000;
        } else if (car instanceof Stringer) {
            return 3100;
        } else {
            return 0;
        }
    }
}
