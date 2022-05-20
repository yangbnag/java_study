package coding02;

import java.util.Scanner;

public class BackJun_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();


        if (x > 0) {
            if (y > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if (y > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }

        }
        /*
                x > 0, y > 0 = 1
                x <0, y >0 = 2
                x <0, y < 0 = 3
                x >0, y < = 4


해석
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt();
        sc.close();

        boolean xPos = x >= 0; //x양수
        boolean yPos = y >= 0; //y양수

        if (xPos && yPos) System.out.println(1);
        else if (!xPos && yPos) System.out.println(2);
        else if (!xPos && !yPos) System.out.println(3);
        else System.out.println(4);
    }
}
                */

    }
}

