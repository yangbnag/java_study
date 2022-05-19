package day02;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 5 ;
        System.out.println(a + 3);
        System.out.println("a = " +a);// a의 값은 5, a 값 변동 x 출력값은 8;
        System.out.println(a += 3); // a = a+3 ; 을 줄인 식
        System.out.println("a = " + a); // a는 8

        a += 2 ; // a=10

        a *= 4 ; // a= 40
        a >>= 2; // a = 10
        System.out.println(a);


    }
}
