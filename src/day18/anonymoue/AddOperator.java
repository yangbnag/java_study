package day18.anonymoue;

// 더하기 기능을 하는 클래스를 만들었다.
public class AddOperator implements Calculator{

    @Override
    public int operate(int n1, int n2) {
        return n1 + n2;
    }
}
