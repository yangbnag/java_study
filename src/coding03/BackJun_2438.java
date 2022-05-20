package coding03;

import java.util.Scanner;

public class BackJun_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = 1; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //* 0 1 1
        //** 1 2 1
        //*** 2 3 1
        //**** 3 4 1
        // ***** 4 5 1


    }
}


