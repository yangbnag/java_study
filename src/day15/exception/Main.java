package day15.exception;

public class Main {
    public static void main(String[] args) {

        try {
            int n = EasyScanner.inputInteger("정수: ");

            double d = EasyScanner.inputFloat("실수: ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    } // 이런때 예외처리를 어디서 해줘야 하나.
    // 메서드에 try cathc를 걸면 메서드가 많을 경우 번거로움이 있음.
}
