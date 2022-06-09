package day12.final_;

public class Korean {

    String name; // 이름

    // 생성자 클래스 안에서도 변경하지 못하게 하고 싶다.
    final String id; // 주민번호 -> id는 생성자에서 초기화 된다.
    final String nation ; //(final로 설정된 nation필드는 상수 인가?!)
/*    static {
        nation = "대한민국";
    }*/
    // 상수 : 불변성과 유일성을 모두 만족
    // final을 붙이면 불변성은 만족 시킨다.
    // 유일성을 만족 시키려면 static과 final을 붙여야 한다.

    // 국적 -> 불변의 값으로 만들고자 final을 썼으면 불변의 값이 된 값이 초기화 되어 있어야 한다.
    // 초기화 시키면 final로 변경을 못하게 할수 있다.

    public Korean(String name, String id, String nation) {
        this.name = name;
        this.id = id;
        this.nation = nation;
    }
    // 생성자에서 우회 하면 된다고 하는데 실습할때 안됨 ㅠ
    // 필드에서 초기화를 해놔서 안되는거 였네;

    public void changeId(String id) {
//        this.id = id;
        // 내부에서도 주민번호 변경이 안된다.
    }

    // 유일성 확인
    @Override
    public String toString() {
        return "이름: " + name + ", 주민번호: " + id + ", 국적 : " + nation;
    }
}
