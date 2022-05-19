package day02;

public class StdOutput {
    public static void main(String[] args) {

        String dog = "멍멍이", cat = "야옹이";
        System.out.println(dog); // println은 자동으로 \n을 붙여준다.
        System.out.print(dog);// println 이 아닌 그냥 print
/*
       System.out.print(dog);
        System.out.print(cat);
 */
        System.out.println("==================");

        int month = 7;
        int day = 17;
        String anniversary = "제헌절";

        System.out.println(month + "월" + day + "일은 " + anniversary + "입니다.");

        //포맷문자 형식
        //%d:10진수 정수 , %f : 실수, %s : 문자열, %c : 단일문자

        System.out.printf("%d월 %d일은 %s 입니다.\n", month,day,anniversary);
        // 줄개행을 하고 싶으면 \n 넣어야 함.
        // 포맷지정은 3개를 해놓고 변수는 2개만 넣을 경우
        // 포맷 인수가 없다는 에러 발생.
        System.out.println(dog);

        //실수 포맷팅
        //%f: 강제로 소수점 6자리를 표현합니다.
        double rate = 25.45678901234;
        System.out.printf("비율은 %.4f입니다.\n",rate); // %.(표현하고 싶은 자리의 숫자)f
        System.out.printf("비율은 %.2f입니다.\n",rate); // 소수 3째자리에서 반올림
        System.out.printf("비율은 %.2f%%입니다.\n",rate); // % 입력시 (특수기호는 %% 2번 써줘야 함.)
    }
}
