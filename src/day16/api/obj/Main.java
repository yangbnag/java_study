package day16.api.obj;

import utility.Util;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pen p1 = new Pen(123, "빨강", 1000);
        Pen p2 = new Pen(new Company("모나미", "서울"), 456, "노랑", 900);
        Pen p3 = new Pen(123, "빨강", 1100);

        // p2를 복사하여 p4에 대입
//        Pen p4 = p2;// 실제 객체 복사가 아닌 주소값 복사
//        Pen p4 = new Pen(p2.serial, p2.color, p2.price); // 이게 객체 복사이다. 번거롭다..
          Pen p4 = (Pen) p2.deepClone(); // 깊은 복사 메서드로 적용후

        // 같은 일련번호를 가지면 같은 공장에서 생산된 제품이라고 가정
        System.out.println(p1.equals(p3)); // (p1 == p3) 주소값 비교 Obj 클래스에서 제공가는 기본 메서드
        // p1과 p3의 시리얼 넘버가 같은지를 확인하는 메서드로 오버라이딩 하여 실행 하였다.
        // Obj의 equals는 주소값을 비교하는 것이기 때문에 모두 false가 나온다.

        p2.color = "노오오오오란색"; // 복사가 잘 되었다면 p2만 색깔이 바뀌어야 한다.
        p2.company.address ="부산"; // 복사 잘 된거 확인 후 p4가 아닌 p2의 company 회사 주소만 부산으로 바꾸려고 한다.

        System.out.println("p2 = " + p2); // p2에 company 클래스 객체 추가하여 복사 실행
        System.out.println("p4 = " + p4); // 깊은 복사 실행 결과 보기


        // 실행결과는 p4도 부산으로 바뀌었다..
        // 얕은 복사와 깊은 복사의 개념

        //Pen p2 = new Pen(new Company("모나미", "서울"), 456, "노랑", 900);
        // new Company 객체가 먼저 실행된다.(heap 120번지) name, address 필드를 갖는 company name : 모나비, address : 서울;
        // 그 다음 pen 객체 실행 (heap 170번지) company, serial, color, price 필드를 갖는다. company는 120번지를 가리킨다.
        // p2는 170번지를 가리킨다.
        // p4 = p2.clone(); 을 실행하면 p4는 210번지 주소를 갖고 170번지를 복사하고, 170번지 안에 있는 company 주소 120번지를 변하지 않는다.
        // 210번지 안에 있는 company도 120번지를 가리키는 것을 얕은 복사 이다.

        // 깊은 복사는 company 주소도 다른 번지수에 저장해줘야 한다.

        Util.line(); // 선긋기 static 메서드 실행

        Count c = null;
        for (int i = 0; i < 20; i++) {
            c = new Count(i+1);
            c = null;
            System.gc(); //가비지 컬렉터를 좀 더 빨리 가동 // 파이널라이즈는 소멸될때 자동으로 호출된다. 사용자가 호출하지 않는다.
            // 생성은 순서대로 되도 소멸은 순서가 없다.

        } // c에는 결국 20번째 생성된 객체만 가지고 있다. 나머지 19개의 객체는 어떻게 처리 해야 하나?
        // 연결이 끊긴 객체는 가비지 컬렉터가 자동으로 처리한다. 언제 처리 될지는 모른다.
        // finalize()를 통해 빠르게 제거할수 있다.
    }
}
