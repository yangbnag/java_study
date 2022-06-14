package day15.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
// 다중 예외 처리
public class TryExample2 {
    public static void main(String[] args) {
        // 에러 상황이 4군데에 존재하는 코드

        // 에러 상황이 발생하는 코드들의 영역을 잡고 ctrl + alt + t 를 누르고 6번 try catch
        try {
            Scanner sc = new Scanner(System.in);
            System.out.printf("정수1; ");
            int n1 = sc.nextInt(); //warning - InputMismatchException

            System.out.printf("정수2; ");
            int n2 = sc.nextInt(); // warning - InputMismatchException

            int div = n1/n2; // warning -
            System.out.println("div = " + div);

            sc.close(); // sc가 null이면
        } catch (ArithmeticException e) { // 다중 catch에서는 클래스를 구체적으로 작성해줄 것.
            System.out.println("0으로 나누면 안됩니다.");
        }
        catch (InputMismatchException e){
            System.out.println("정수로만 입력하세요!");
        } catch (NullPointerException e) {
            System.out.println("객체 초기화를 확인하세요.");
        }
        catch (Exception e) {
            System.out.println("알 수 없는 예외 발생! 관리자에게 문의하세요!"); // 대비하지 못한 예외처리 구분
        } // else if 처럼 Exception e 이 상위 타입이므로 모든 에러를 다 해결주어 아래로 에러가 내려가지 못한다.


        System.out.println("프로그램 정상 종료!");
    }
}
