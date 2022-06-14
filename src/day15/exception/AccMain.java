package day15.exception;

public class AccMain {
    public static void main(String[] args) {

        Account acc = new Account();
        try {
            acc.withdraw(10000);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        // 출금이 안되는 상황
        // 사용자 입장에서 문제 인지가 되지 않음.
        // return 보다 더 강력하게 withdraw의 문제를 인식 시켜줘야 한다. ( 강제 에러 발생 )
        // ex) 서버가 공격받으면 서버를 다운 시키는게 적극적인 대응 방법이다.
    }
}
