package day11.inherit;

    // 자식 클래스 (sub class)
public class Warrior extends Player {

    public int rage; // 분노게이지

    public Warrior(String name) {
          super(name);
        // Player는 누가 호출 하였는가?
        // super();가 생략 되어 있다.
//        super(); // super(); 부모의 생성자를 호출    //ex) this(); ← 나의 생성자를 호출
        this.rage = 50;
        // 원칙적으로 말하면 this.level 은 super.level이 맞다.

        System.out.println("Warrior 생성자 호출!");
    }


       public void showStatus() {
            super.showStatus();     // 부모의 showStatus() 메서드 호출
            System.out.println("# rage : " + rage);

        }


    public void rush() {
        System.out.println(name + "님이 돌진합니다.");
    }

}
