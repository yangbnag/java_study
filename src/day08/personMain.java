package day08;

public class personMain {
    public static void main(String[] args) {

        Person person = new Person("홍길동");

        // class에서 생서자를 정의하지 않았는데 어떻게 main 클래스에서
        // 실행이 되는가?

        // 생성자를 만들어준 후 다시 와보니 빨간줄이 그어졌다.
        // 생성자가 하나도 없으면 기본생성자를 기본적으로 하나를 만들어준다.
        // 생성자가 있으면 기본생성자가 만들어 지지 않는다.
        // 위에 빨간 줄은 기본생성자가 아닌 매개변수가 필요한 생성자이기 때문이다.

        // ** 기본 생성자는 무조건 하나를 만들어 주는게 아니라는 점 기억 하기! **

    }
}
