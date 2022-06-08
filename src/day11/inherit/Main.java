package day11.inherit;

public class Main {
    public static void main(String[] args) {
        Warrior w = new Warrior("키보드워리어");
        Mage m = new Mage("번개왕썬더");
        Hunter h = new Hunter("멍멍이조련사");

        w.hashCode(); // 참조가 된다는 것은 어딘가에서 물려받았다는 뜻이다.

//        w.level = 10;
//        w.showStatus(); // 전사는 분노게이지 표시 하고 싶다.
//        m.showStatus(); // 마법사는 마나게이지 표시 하고 싶다.
//        h.showStatus(); // 헌터는 화살개수를 표시 하고 싶다.
//        w.rush();

       /* // 경험치 속성을 넣고 싶다.
        w.exp = 100;
        m.exp = 50;
        h.exp = 200;

        w.showStatus();*/


    }
}
