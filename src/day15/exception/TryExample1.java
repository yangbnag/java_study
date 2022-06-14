package day15.exception;

public class TryExample1 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 0; //1.
        // 예외처리란 지금은 문제가 없지만 예를 들어 사용자가 n1,n2를 입력 하는 경우에
        // 사용자가 n2에 0을 입력하면 11번에서 에러가 발생하는 것처럼
        // 예외가 발생할수 있는 코드를 찾아서 예외처리를 해줘야 한다.
        // 아래 코드에서는 3.이 에러 발생 가능성이 있다.

        System.out.println("나눗셈 시작!"); //2.

        // 예외처리 하기
        try {
            // 예외 발생 가능성이 있는 코드
        System.out.printf("%d/%d = %d\n",n1,n2, n1/n2);//3.

            // 예외 발생시 실행할 코드를 작성
        } catch(Exception e) { // catch의 괄호 안에는 처리할 예외에 대한 클래스와 매개변수를 작성
            System.out.println("0으로 나눌 수 없습니다.");
            // catch에서 예외 클래스를 잘못 잡으면 에러가 발생.
            // 에러의 최상의 클래스를 설정해 놓고, 확실히 에러를 파악 되면 정확한 클래스를 catch에 입력

            // 예외 처리 후에 예외 로그를 보고 싶을 때
            e.printStackTrace();

            //전체로그 말고 예외 원인 메시지만 확인하고 싶을 때
            System.out.println(e.getMessage());
        }

        System.out.println("프로그램 정상 종료!");//4.

    }
}
