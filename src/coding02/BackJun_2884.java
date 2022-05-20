package coding02;

import java.util.Scanner;

public class BackJun_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt(), m = sc.nextInt();

        int outH = 0;
        int outM = 0;


        if((h == 0) && (m < 45)) {
            outH = 23;
            outM = 60 - (45-m);
            System.out.printf("%d %d",outH,outM);
        }
        else if(m<45) {
            outH = h-1;
            outM = 60 - (45-m);
            System.out.printf("%d %d",outH,outM);
        }
        else{
            outM = m-45;
            System.out.printf("%d %d",h,outM);
        }




      /*
       첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그
      리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
      입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고,
      끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.

      입력한 시간 보다 45분 늦게 출력 10:10 -> 9:25

      입력한 분 < 45 이면  출력할 분은 (ex 10:10 일때  : 60 - ( 45 - 입력한 분 ) ) 이된다.
      입력한 분 < 45 이면 출력할 시간은 (ex 10:10 일때 입력한 시간 - 1) 이 된다.

      입력한 분 > 45 이면 출력할 분은 (ex 10:50 일때 : 입력한분 - 45) 가 된다.

      만약 입력한 시간이 0시 이면  시간은 (23)

해석
import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(), M = sc.nextInt();
        sc.close();

        if (M >= 45) {
            System.out.printf("%d %d\n", H, M - 45);
        } else if (M < 45 && H >= 1) {
            System.out.printf("%d %d\n", H - 1, M + 15);
        } else {
            System.out.printf("%d %d\n", 23, M + 15);
        }
    }
}
       */

    }
}

