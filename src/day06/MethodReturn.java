package day06;

import java.util.Arrays;

public class MethodReturn {
    //메서드 리턴
    static int add(int n1, int n2) {
        return n1+n2;
//        System.out.println(add"dd"); // 탈출문의 의미 위에 리턴이 있어서 return밑에 있는 프린트함수 호출x
    }

    // 두 개 정수의 합을 출력하는 함수
   static void showAddResult(int n1, int n2){ // 출력만 하는 함수는 리턴값이 없으므로 타입을 void로 입력
        System.out.printf("%d+%d+%d",n1,n2,n1+n2);
    }

    //이름을 출력 5글자 넘으면 출력x
    static void callName(String name) {
        if(name.length() > 5) {
            System.out.println("이름이 너무 길어 즐~~");
            return;// 함수 탈출문 // void 함수에서는 단독 리턴 뒤에 값을 붙이면 안된다.
        }
        System.out.printf("%s 하위~~\n",name);
    }
    /*
    # 모든 함수의 리턴값은 반드시 1개다.
        - 5개의 애완동물 이름목록에서 원하는 숫자를 전달하면
          그 숫자만큼 랜덤으로 애완동물리스트를 뽑아서 리턴하는 함수
          리턴값이 많을 때는 데이터를 하나로 묶어서 리턴
     */
    static String[] selectPet(int count) {
        //매개변수 검증
        if(count < 1 || count > 5) {
            return null; // 메서드에서 이미 리턴 받는 것이 있기 때문에 에러 발생
            // return 값에 null을 입력.
        }

        String[] petList = {"멍멍이","짹짹이","꽥꽥이","찍찍이","꾸러긔"};
        //중복이 되도 상관없다는 가정하에 원하는 숫자만큼의 애완동물을 출력하기
        // 1.랜덤으로 뽑아서 새로운 배열안에 넣기
        String[] selected = new String[count]; // 랜덤선택한 애완동물이 저장될 배열
        for (int i = 0; i < count; i++) {
            int rn = (int) (Math.random()*petList.length);
            selected[i] = petList[rn];
        }
        return selected;
    }

    public static void main(String[] args) { //main 메서드도 리턴값이 없기 때문에 리턴타입에 void가 입력 되어 있다.

        int r1 = add(10,20);
        System.out.println(r1);

        // 함수로 리턴된 값을 활용 하고 싶을때 변수에 저장
        int r2 = r1 * 3 * r1--;
        System.out.println(r2);
        System.out.println(r1);

        //리턴값이 없는 함수는 변수에 저장이 불가능함. (단독 호출하여 사용해야 한다.)
        showAddResult(3,8);

        System.out.println(); // -> 리턴 타입은 void
        Math.random(); // -> 리턴 타입은 double

        add(add(10,20),add(5,5)); // add 함수 3번 호출, 안쪽 부터
        //1차 호출 add(30,add(5,5))
        // 2차 호출 add(30,10)
        // 3차 40

        //void 함수는 다른 함수의 인자값으로 넣을수 없다.

        //void 함수의 활용 예예
        //showAdResult(add(4,4),add(5,7));

        callName("짝짝이");
        callName("주차왕파킹맨");

        System.out.println("====================");

        String[] selectPet = selectPet(-2); // 인수 입력에 제한을 걸어야 한다.
        System.out.println(Arrays.toString(selectPet));





    }
}
