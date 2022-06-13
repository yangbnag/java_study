package day14.abs.car;

public abstract class Car {

    // 가속 기능
    public abstract void accel();
    // 감속기능
    public abstract void brake();
    // 핸들 열선 기능
    public final void heatHandle(){
        System.out.println("온도가 10도까지 올라갑니다.");
    }
    // final을 핸들열선 기능에 적용하면
    // 모든 차들은 기능을 바꿀수 없다.

}
