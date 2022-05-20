package coding01;

import java.util.Scanner;

public class BackJun_2588 {
    public static void main(String[] args) {
        // 첫째줄에 A+B 입력 // 3번째 줄에 정답 출력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
// a = 472, b = 385

        int c = (a*(b%10)); // 2360
        // 427 * (385/10 = 38.5 中 나머지 5를 곱함)
        int d = a*((b/10)%10); // 3776
        // 427 * (385/10 = 38.5 中 몫인 38에 10를 나눈 나머지 8을 곱함)
        int e = a*(b/100); // 1416
        // 427 * ( 385 / 100 은 몫 3 을 곱함)
        int f = a*b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);


    }
}
