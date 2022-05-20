package coding02;

import java.util.Scanner;

public class BackJun_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B= sc.nextInt();

        if(A>B) {
            System.out.println(">");
        } else if (A<B) {
            System.out.println("<");
        } else
            System.out.println("==");
    }
}
