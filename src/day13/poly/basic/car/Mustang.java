package day13.poly.basic.car;

public class Mustang extends Car {

    @Override
    public void run(){
        System.out.println("머스탱이 달립니다.");
    }

    // 머스탱만 가지고 있는 메서드 (그랜저, 스팅어에는 없음)
    public void joinMustangClub(){
        System.out.println("머스탱 동호회에 가입합니다.");
    }

}
