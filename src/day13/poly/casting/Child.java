package day13.poly.casting;

public class Child extends Parent{

    @Override // 빨간줄 안뜨면 오버라이드가 맞는거
   public void m2() {
        System.out.println("오버라이딩된 2번 메서드");
    }

//    @Override
    public void m3(){
        System.out.println("자식의 3번 메서드");
        }
}


