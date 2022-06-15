package day16.api.obj;

public class Pen extends Object implements Cloneable {

    // 객체 복사를 사용하려면 Cloneable 인터페이스를 구현해야 함.

    Company company; // 제조사 정보 _컴포지션 (클래스안에 객체)
    long serial;// 일련번호
    String color;// 색상
    int price;//가격

    public Pen(Company company, long serial, String color, int price) {
        this.company = company;
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Pen) {
            Pen p = (Pen) o;
            return this.serial == p.serial;
        }
        return false;
    } // 부모 Obj클래스의 equals 메서드 오버라이딩

    // clone: 객체 복사 (얕은 복사 개념 - 해당 포인터 객체만 복사)
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    // 깊은 복사 : 해당 객체뿐만 아니라 컴포지션된 객체도 모두 복사
    public Pen deepClone() throws CloneNotSupportedException {
       // 1. 우선 얕은 복사 진행
        Pen copy = (Pen) this.clone();
        // 2. 컴포지션된 객체도 복사 진행
        copy.company = (Company) copy.company.clone();
        return copy;
    }









    @Override
    public String toString() {
        return "Pen{" +
                "company = " + company +
                "serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
