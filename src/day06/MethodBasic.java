package day06;

//자바의 메서드는 클래스 내부, 메서드 외부에서 선언가능
//메서드 호출은 메서드, 생성자 내부에서만 가능
public class MethodBasic {
        // 1 ~ x 까지의 누적합을 구해서 리턴하는 함수
           static int calTotal(int x) { // static 은 다음에 개념 설명 들어야함.
               //일단은 메서드 만들때 static을 무조건 먼저 쓸 것.
               System.out.println("메서드호출!");

               int total = 0;
               for (int i = 1; i <= x; i++)
                   total += i;
                   return total;// java의 함수

           }


    public static void main(String[] args) {


     // 메서드 호출
        calTotal(10);
        int result = calTotal(10);
        System.out.println("result :" + result);
    } //end main method
}//end class
