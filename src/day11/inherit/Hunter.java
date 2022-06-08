package day11.inherit;

public class Hunter extends Player {

    public int arrow; // 화살수

    public Hunter(String name) {
        // 부모 객체를 만들어야 한다.
        // 부모 생성자를 실행해야 한다.
        // 부모 생성자는 인수로 String이 필요하다.
        super(name);
        this.arrow = 1000;
    }
    public void showStatus() {
        super.showStatus();     // 부모의 showStatus() 메서드 호출
        System.out.println("# arrow : " + arrow);

    }

    public void blazeShot(){

        System.out.println(name + "님이 폭발 화살을 시전합니다.");
    }

}
