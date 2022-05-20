package coding01;

import java.util.Scanner;

public class BackJun_10430 {
    public static void main(String[] args) {
        // 첫째줄에 A+B 입력 // 3번째 줄에 정답 출력
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(),C = sc.nextInt();
        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B) % C);
        System.out.println(((A%C) * (B%C))%C);



    }
}
