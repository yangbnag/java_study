package coding03;

import java.util.Scanner;

public class BackJun_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            for (int a = 0; a < num - i; a++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //* 0 4 1
        //** 1 3 2
        //*** 2 2 3
        //**** 3 1 4
        // ***** 4 0 5


    }
}


