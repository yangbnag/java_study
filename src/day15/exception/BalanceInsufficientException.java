package day15.exception;

// 사용자 예외 클래스 만들기
// 사용자 정의 예외 클래스
public class BalanceInsufficientException extends Exception { // 잔액부족에러


    public BalanceInsufficientException() {
    }

    public BalanceInsufficientException(String message) {
        super(message);
    }
}

// 예외 클래스는 Exception 상속 받고, 기본 생성자, 문자열을 부모에게 전달할 메서드를 만들면 된다.
