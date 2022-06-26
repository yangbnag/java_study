package day06;

import java.util.Arrays;

//parameter(매개변수) : 함수가 외부에서 받아와야 하는 값을 저장하는 공간
public class MethodParam {
    //2개의 정수를 전달받아 그 합을 돌려주는 함수
    //함수 만들기
    //1. 이름 짓기 ()
    //2. 소괄호 안에 필요한 데이터 넣기데이터 타입 적어야 한다.
    //3. 로직 작성
    //4. 리턴되는 데이터의 타입을 이름 앞에 써주고 이름앞에 static쓰기
    static int add(int n1,int n2) {
        System.out.println("함수 호출!");
        int sum = n1 + n2;
        return sum;
    }

    //n개의 정수를 전달받아 그 총합을 리턴하는 함수
   static int addAll(int... numbers) {
        // ...을 쓰면 매개변수 자리에 배열을 넣어도 되고, 숫자를 넣어도 된다.
        // addAll 앞에 타입은 return되는 데이터의 타입을 써주면 된다.
        int total = 0;
       for (int n : numbers)
           total += n;
           return total;
    }

    // 함수 매개변수에 배열을 두개 받아야 할 경우 ... 사용 하면 안된다.
    // 2개의 배열을 전달받아 길이가 더 긴 배열을 리턴하는 함수
    static int[] compareLength(int[] nums1, int[] num2){
        return (nums1.length > num2.length) ? nums1 : num2;
    }
    // int ... nums1, int ... nums2로 해놓을때
    // 함수 호출시 compareLength(1,2,3,4,5,6,7,8,9,10) 을 넣으면 어디가 nums1 배열이고
    // 어디가 num2 배열인지 모르기 때문에 배열 2개 이상 받을때는 직접 묶어서 넣어 줘야한다.

    // 매개변수가 없는 함수
    static void hello() {
        System.out.println("안녕하세요");
    }

    public static void main(String[] args) {
        // 코드의 제어권을 갖는 main method 호출은 자바에서 자동으로 해줌.
        System.out.println("함수호출 전!"); // 제어권 main

        add(10,20); // 제어권 add
        System.out.println(add(10,20)+50);// 함수를 2개 호출 println과 add
        // 내부에 있는 add 함수 호출 후 println 함수 호출
        // add에 있는 함수호출! 출력 후 80 출력력
        System.out.println("함수호출 후!"); // 제어권 main

        System.out.println("====================");
//        add(8, 5, 100); // 함수에 설정된 매개변수보다 데이터를 많이 넣었을때
//        add(8,"5"); // 설정된 타입과 다른 데이터를 넣었을때
       long x = 12L;
       add(8,(int)x); // 자동 다운 캐스팅이 없기 때문에 형 변환을 해줘야함.

        System.out.println("====================");

        //n개의 정수를 전달받아 그 총합을 리턴하는 함수 호출
        int[]arr={10,20,30};
        int sum = addAll(arr);
        System.out.println(sum);
        // 매개변수와 리턴값 이해하기기
        // 엄마 카레해줘 라는 함수(감자, 양파, 가루);
        //엄마 카레해줘 함수는 카레를 리턴해줌.

        System.out.println("22.06.25");
        System.out.println(addAll(new int[] {1,2,3,4,5,6,7,8,9,10}));

        //addAll에 배열값 바로 넣기
        int sum2 = addAll(new int[]{3,6,9,12}); // new int 생략은 선언 할때만 가능
        System.out.println(sum2);

        // 인수 자리에 배열을 넣어도 실행이 된다.

        // addAll(int ... numbers) 을 쓰면 매개변수 자리에 배열을 넣어도 되고, 숫자를 넣어도 된다.
        int sum3 = addAll(5,10,15,20,25,30);
        System.out.println(sum3);

        int sum4 = addAll(45,10,25,20,105,30);
        System.out.println(sum4);

        // 2개의 배열을 전달받아 길이가 더 긴 배열을 리턴하는 함수
       int[] result = compareLength(new int[]{1,2,3,4,5}, new int[]{6,7,8,9});
        System.out.println(result);
        System.out.println(Arrays.toString(result));


        hello();

    } // end main method
} // end class
