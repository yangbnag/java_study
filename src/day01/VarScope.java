package day01;

public class VarScope {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        // 특정 블록에서 선언된 변수는 해당 블록을 벗어나면
        // 메모리에서 자동 삭제됨

        if (true) {
        int num3; // 문제 발생시 alt + Enter를 누르면 문제 제시 인텔리제이 기능.
            num1 = 300; // 상위 블록에 존재하는 동일한 변수명 선언 불가.
            num3 = num1 + num2;
            System.out.println("num3 = " + num3);
        } // end if

//        System.out.println("num3 = " + num3);
        System.out.println("num1 = " + num1);

        int i = 5;
        int num3 = 500; // if문을 나오면서 num3는 사라지기 때문에 이 영역에서 num3 변수 선언 가능
        System.out.println(num3);
    } // end main





//    int num4 = num1 + num2;
} // class
