package day15.exception;

public class Account {
    String owner;
    int balance; // 잔액

    // 출금 기능
    public void withdraw(int money) throws BalanceInsufficientException{
        if (balance < money) {
            // throw : 유발하다, 발생하다
            throw new BalanceInsufficientException("잔액 부족!!"); // 새로운 에러를 발생 시킨다.
        }
        this.balance -= money;
    }
}
