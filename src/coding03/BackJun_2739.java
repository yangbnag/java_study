package coding03;

import java.util.Scanner;

public class BackJun_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 0;

        for(int i=1; i <= 9 ; i++) {
            num = i*n;
            System.out.printf("%d * %d = %d\n", n,i,num);
        }

    }
}

